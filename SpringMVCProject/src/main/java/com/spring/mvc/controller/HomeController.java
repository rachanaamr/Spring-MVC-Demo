package com.spring.mvc.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping("/overview")
//	public String method1()
//	{
//		System.out.println("Going to index.jsp page, Called from method1");
//		return "index";	
//	}
	
	//Single object data controller
	public String method1(Model model)
	{
		System.out.println("Going to index.jsp page, Called from method1");
		model.addAttribute("name","Capgemini");
		return "index";	
	}

	@RequestMapping("/content")
//	public String method2()
//	{
//		System.out.println("Going to display.jsp page, Called from method2");
//		return "display";	
//	}
	
	//Send the collection
	
	public String method2(Model model)
	{
		System.out.println("Going to display.jsp page, Called from method2");
		List<String> employees = Arrays.asList("Rachanaa","Raghu","Ramya","Rakshita","Ramesh");
		model.addAttribute("employeesname", employees);
		return "display";	
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("name","Rachanaa");
		mv.setViewName("help");
		return mv;
	}
}
