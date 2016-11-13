package org.niit.controller;

import org.niit.dao.CartDao;
import org.niit.dao.OrderDao;
import org.niit.model.Cart;
import org.niit.model.UserOrder;
import org.niit.model.Userdetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/*
 * This controller is used to handle user order
 */
@Controller
public class OrderController {

    @Autowired
    private CartDao cartDao;

    @Autowired
    private OrderDao orderDao;
    /*
     * createOrder method is used to insert user order into the database.
     */
    @RequestMapping("/order/{cartId}")
    public String createOrder(@PathVariable("cartId") int cartId) {
    	System.out.println("in order");
    	UserOrder userOrder = new UserOrder();
        Cart cart=cartDao.getCartById(cartId);
        userOrder.setCart(cart);

        Userdetails userdetails = cart.getUserdetails();
        userOrder.setUserdetails(userdetails);
       // userOrder.setBillingAddress(userdetails.getBillingAddress());
        //userOrder.setShippingAddress(usersDetail.getShippingAddress());

        orderDao.addOrder(userOrder);

        return "redirect:/checkout?cartId="+cartId;
    }
}
