package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@ResponseBody
	@RequestMapping("/write")
	public String write/*@RequestParam("n") String name*/
	(@RequestParam(value="n",required=true,defaultValue="") String name,
			@RequestParam(value="age",required=true, defaultValue="10")int age)
	{
		System.out.println("name : " + name);
		return "BoardController:write : " + name + " : " + age;
		
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam String name)
	{/*권장은 requestparam이 같더라도 써준다*/
		System.out.println("name : " + name);
		return "BoardController:update";
	}
	@ResponseBody
	@RequestMapping("/view/{no}")
	public String view(@PathVariable("no") Long no)
	{
		return "BoardController:view("+no+")";
	}

}
