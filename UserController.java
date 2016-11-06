package org.niit.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import org.niit.dao.UserdetailsDAO;
import org.niit.model.Userdetails;

@Controller
public class UserController {
	@Autowired
	UserdetailsDAO userdetailsDAO;
	
	@Autowired
	Userdetails userdetails;
	
	@RequestMapping("/Login")
	public ModelAndView login(@RequestParam(value = "username")String username, @RequestParam(value= "password")String password,HttpSession session)
	{
		ModelAndView model = new ModelAndView("home");
		String msg;
		userdetails = userdetailsDAO.isValidUser(username, password);
		if(userdetails== null)
		{
			msg = "Invalid user...please try again";
			
		}
		else
		{
			if(userdetails.getRole().equals("ROLE_ADMIN"))
			{
			ModelAndView mv = new ModelAndView("Admin");
			return mv;
			}
			session.setAttribute("Welcome", userdetails.getName());
			
		}
		return model;
	}
@RequestMapping("/logout")
public ModelAndView logout(HttpServletRequest request,HttpSession session)
{
	ModelAndView mv= new ModelAndView("home");
	session.invalidate();
	session=request.getSession(true);
	mv.addObject("msg","You successfully logged out");
	mv.addObject("loggedOut", "true");
	return mv;
}
@RequestMapping(value = "/loginsuccess") //value should be same as given in authentication-success-forward-url tag in springsecurity.xml
public String login_session_attributes(HttpSession session,Model model) 
{
	//System.out.println("Hello");
	String username = SecurityContextHolder.getContext().getAuthentication().getName();
	
	Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
	String page="";
	
	String role="ROLE_USER";
	for (GrantedAuthority authority:authorities) 
	{
	 System.out.println(authority.getAuthority());
	     if (authority.getAuthority().equals(role)) 
	     {
	    	 
	    	 session.setAttribute("UserLoggedIn", "true");
	    	 session.setAttribute("Username", username);
	    	 page="home";
	    	 
	    	 break;
	     }
	     else 
	     {
	    	 session.setAttribute("LoggedIn", "true");
	    	 session.setAttribute("Administrator", "true");
	    	 page="Admin";
	    	 break;
	    }
	}
	return page;

	
}
}
