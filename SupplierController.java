package org.niit.controller;

import org.niit.dao.SupplierDAO;
import org.niit.model.Supplier;
import org.niit.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class SupplierController {
	@Autowired
	private SupplierDAO supplierDAO;
	@Autowired
	private Supplier supplier ;
	
	@RequestMapping(value="/suppliers" , method=RequestMethod.GET)
	public String getListCategories(Model model){
		
		model.addAttribute("supplier", supplier);
		model.addAttribute("supplierList", this.supplierDAO.list());
		return "supplier";		
	}
	
	@RequestMapping(value="/supplier/add" , method=RequestMethod.POST)
	public String addSupplier(@ModelAttribute("supplier") Supplier supplier, Model model){
		
		Util util=new Util();
		String id=util.replace(supplier.getId(), ",", "");
		supplier.setId(id);
		
		supplierDAO.saveOrUpdate(supplier);
		model.addAttribute("supplier", supplier);
		model.addAttribute("supplierList", this.supplierDAO.list());
		return "supplier";
	}
	
	@RequestMapping("removesupplier/{id}") 
	public String deleteSupplier(@PathVariable("id") String id, ModelMap model)
	
	{
		System.out.println("delete");
		supplierDAO.delete(id);
		model.addAttribute("supplier", supplier);
		model.addAttribute("supplierList", this.supplierDAO.list());
		return "redirect:/suppliers";
	}
	
	@RequestMapping("editsupplier/{id}")
	public String editSupplier(@PathVariable("id")String id, Model model)
	{
		
		model.addAttribute("supplier",this.supplierDAO.get(id));
		model.addAttribute("supplier", supplier);
		model.addAttribute("supplierList", this.supplierDAO.list());
		
		return "supplier";
		
	}
}


