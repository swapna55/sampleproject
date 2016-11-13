package org.niit.controller;



import java.security.Principal;

import org.niit.dao.UserdetailsDAO;
import org.niit.model.Userdetails;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/*
 * This controller is called when user clicks on cart menu or button
 */
@Controller
@RequestMapping("/user/cart")
public class UserCartController {

    @Autowired
    private UserdetailsDAO userdetailsDAO;
    
    /*
     * Initially getCart method is called to get user card items from database
     */
    @RequestMapping
    public String getCartItems( Principal username,Model model){
    	Userdetails userdetails = userdetailsDAO.getCustomerByUserName(username.getName());
        int cartId = userdetails.getCart().getCartId();

        return "redirect:/user/cart/"+cartId;
    }
    /*
     * getCartRedirect method is called from getCart method to set retrieved cart from the database.
     */
    @RequestMapping("/{cartId}")
    public String getNewUrl(@PathVariable (value = "cartId") int cartId, Model model) {
        model.addAttribute("cartId", cartId);

        return "cart";
    }

}
