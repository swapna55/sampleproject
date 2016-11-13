package org.niit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.niit.dao.CategoryDAO;
import org.niit.model.Category;
import org.niit.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {
	@Autowired
	private CategoryDAO categoryDAO;
	@Autowired
	private Category category ;
	
	@RequestMapping(value="/categories" , method=RequestMethod.GET)
	public String getListCategories(Model model){
		
		model.addAttribute("category", category);
		model.addAttribute("categoryList", this.categoryDAO.list());
		return "category";		
	}
	
	@RequestMapping(value="/category/add" , method=RequestMethod.POST)
	public String addCategory(@ModelAttribute("category") Category category, Model model){
		Util util=new Util();
		String id=util.replace(category.getId(), ",", "");
		category.setId(id);
		
		
		//String newID = Util.removeComma(name);
		//category.setId("id");
		categoryDAO.saveOrUpdate(category);
		model.addAttribute("category", category);
		model.addAttribute("categoryList", this.categoryDAO.list());
		return "category";
	}
	
	@RequestMapping("removecategory/{id}") 
	public String deleteCategory(@PathVariable("id") String id, ModelMap model)
	
	{
		System.out.println("delete");
		categoryDAO.delete(id);
		return "redirect:/categories";
	}
	
	@RequestMapping("editcategory/{id}")
	public String editCategory(@PathVariable("id")String id, Model model)
	{
		/*ModelAndView mv = new ModelAndView("/AdminCategory");

		if(categoryDAO.get(category.getId())!= null)
		{
			categoryDAO.update(category);
			model.addAttribute("categoryList", this.categoryDAO.list());
			mv.addObject("message", "successfully updated ");
		}
		else
		{
			mv.addObject("errorMessage","Could not update the record");
		}
	return mv;*/
		model.addAttribute("category",this.categoryDAO.get(id));
		model.addAttribute("category", category);
		model.addAttribute("categoryList", this.categoryDAO.list());
		
		return "category";
		
		
	}
	

}



