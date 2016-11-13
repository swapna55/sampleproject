package org.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

import org.niit.dao.UserdetailsDAO;
import org.niit.model.Userdetails;

@Controller
public class HomeController {

	@Autowired
	Userdetails userdetails;
	@Autowired(required=true)
	UserdetailsDAO userdetailsDAO;
	
	@RequestMapping("/")
	public ModelAndView onLoad(HttpSession session)
	{
	ModelAndView mv = new ModelAndView("home");

	return mv;
	}
	@RequestMapping("Register")
public ModelAndView registerhere()
{
	ModelAndView mv = new ModelAndView("Register");
	mv.addObject("userDetails", userdetails);
	mv.addObject("isUserClickedRegisterHere", "true");
	return mv;
}

@RequestMapping("LoginHere")
public ModelAndView loginHere()
{
	ModelAndView mv = new ModelAndView("Login");
	mv.addObject("userDetails", userdetails);
	mv.addObject("isUserClickedLoginHere", "true");
	return mv;
}
	
@RequestMapping(value="/RegisterSuccess",method = RequestMethod.POST)
public ModelAndView registerUser(@ModelAttribute Userdetails userdetails)
{
	ModelAndView mv = new ModelAndView("Login");
	if(userdetailsDAO.get(userdetails.getUsername())==null)
	{
		userdetailsDAO.save(userdetails);
		mv.addObject("msg","you are successfully registered");
	}
	else
	{
		mv.addObject("msg", "user exist with this username");
	}
	
	mv.addObject("isUserClickedSubmit", "true");
	return mv;
}
}


