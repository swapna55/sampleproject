package org.niit.controller;

import org.niit.dao.CategoryDAO;
import org.niit.dao.ProductDAO;
import org.niit.dao.SupplierDAO;
import org.niit.dao.UserdetailsDAO;
import org.niit.model.Category;
import org.niit.model.Product;
import org.niit.model.Supplier;
import org.niit.model.Userdetails;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AdminController {
	
	
	@Autowired
	private Category category;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@Autowired
	private Supplier supplier;
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private Product product;
	
	@Autowired
	private UserdetailsDAO userdetailsDAO;
	
	@Autowired
	private Userdetails userdetails;
	
	
	@RequestMapping("/manageCategories")
	public ModelAndView categories()
	{
		ModelAndView mv = new ModelAndView("category");
		mv.addObject("category",category);
		mv.addObject("isAdminClickedCategories","true");
		mv.addObject("categoryList",categoryDAO.list());
		return mv;
		
	}
	@RequestMapping("/manageSuppliers")
	public ModelAndView suppliers()
	{
		ModelAndView mv = new ModelAndView("supplier");
		mv.addObject("supplier",supplier);
		mv.addObject("isAdminClickedSuppliers","true");
		mv.addObject("supplierList",supplierDAO.list());
		return mv;
		
	}
	
	@RequestMapping("/manageProducts")
	public ModelAndView products()
	{
		ModelAndView mv = new ModelAndView("product");
		mv.addObject("product",product);
		mv.addObject("isAdminClickedProducts","true");
		mv.addObject("category",category);
		mv.addObject("categoryList",categoryDAO.list());
		mv.addObject("supplier",supplier);
		mv.addObject("supplierList",supplierDAO.list());
		mv.addObject("productList",productDAO.list());
		return mv;
		
	}
	
	@RequestMapping("/viewCustomers")
	public ModelAndView customers()
	{
		ModelAndView mv = new ModelAndView("customerdetails");
		mv.addObject("userdetails", userdetails);
	
		mv.addObject("ListUserdetails", userdetailsDAO.listUserdetails());
		return mv;
	}
	
	
	
}
