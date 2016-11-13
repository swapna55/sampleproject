package org.niit.controller;


import org.niit.dao.CartDao;
import org.niit.dao.CartItemDao;
import org.niit.dao.ProductDAO;
import org.niit.dao.UserdetailsDAO;
import org.niit.model.Cart;
import org.niit.model.CartItem;
import org.niit.model.Product;
import org.niit.model.Userdetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;


/*
 *Only for User Role
 *This controller is used to handle rest service calls.
 *All functionality related to user cart is written in this controller.
*/
@Controller
@RequestMapping("/usercart/cart")
public class CartController {

    @Autowired
    private CartDao cartdao;
    
    @Autowired
    private CartItemDao cartItemdao;
@Autowired
private CartItem cartItem;
    @Autowired
    private UserdetailsDAO userdetailsDAO;

    @Autowired
    private ProductDAO productDAO;
    @Autowired
    private Product product;

    @RequestMapping("/refreshCart/{cartId}")
    public @ResponseBody
    Cart getCartById (@PathVariable(value = "cartId") int cartId) {
        return cartdao.getCartById(cartId);
    }
    /*
     * addItem method is used to add a item in user cart.
     */

    @RequestMapping(value = "/addItem/{id}",method=RequestMethod.PUT)
   
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
  
    public void addItem (@PathVariable(value ="id") String id, Principal username) {

    	Userdetails userdetails = userdetailsDAO.getCustomerByUserName(username.getName());
        Cart cart = userdetails.getCart();
        Product item = productDAO.getProductById(id);
        List<CartItem> cartItems = cart.getCartItems();
System.out.println("jjj");
        for (int i=0; i<cartItems.size(); i++) {
            if(item.getId()==cartItems.get(i).getProduct().getId()){
                CartItem cartItem = cartItems.get(i);
                cartItem.setPname(item.getName());
                cartItem.setPrice(item.getPrice());
                cartItem.setQuantity(cartItem.getQuantity()+1);
                cartItem.setTotalPrice(item.getPrice()*cartItem.getQuantity());
                cartItemdao.addCartItem(cartItem);

                return;
            }
        }

        CartItem cartItem = new CartItem();
        cartItem.setProduct(item);
        cartItem.setPname(item.getName());
        cartItem.setPrice(item.getPrice());
        cartItem.setQuantity(1);
        cartItem.setTotalPrice(item.getPrice()*cartItem.getQuantity());
        cartItem.setCart(cart);
        cartItemdao.addCartItem(cartItem);
        
    }
    /*
     * removeItem method is used to remove a item from user cart.
     */
    @RequestMapping(value = "/removeItem/{id}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void removeItem (@PathVariable(value = "id") int itemId) {
        CartItem cartItem = cartItemdao.getCartItemByItemId(itemId);
        cartItemdao.removeCartItem(cartItem);

    }
    /*
     * clearCartItems method is used to remove all items from user cart.
     */
    @RequestMapping(value = "/clearCartItems/{cartId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void clearCartItems(@PathVariable(value = "cartId") int cartId) {
        Cart cart = cartdao.getCartById(cartId);
        cartItemdao.removeAllCartItems(cart);
    }
   
}
