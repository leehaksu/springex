package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(@RequestParam("n")  String name)
	{
		System.out.println(name);
		return "/WEB-INF/views/hello.jsp";
	}
	@RequestMapping("/hello2")
	public ModelAndView hello2(@RequestParam("n") String name)
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("name",name);
		System.out.println(name);
		return mav;
	}
	@RequestMapping("/hello3")
	public  String hello3(@RequestParam("n") String name)
	{
		Model model = null;
		ModelAndView mav = new ModelAndView();
		mav.addObject("name",name);
		model.addAttribute("name",name);
		System.out.println(name);
		return "/WEB-INF/views/hello.jsp";
	}
	/*@RequestMapping("/hello3")
	public void hello3(HttpServletRequest request,Writer out)
	{
		String name =request.getParameter("name");
		out.writer("<h1> hello"+name+"</h1>");
	}*/

}
