package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jx372.springex.Vo.UserVo;

/*request mapping(type +method)*/
@Controller
@RequestMapping("/user")
public class UserController {
	@ResponseBody
	@RequestMapping("/joinForm")
	public String joinForm()
	{
		return "userController:joinform";
	}
	@ResponseBody
	@RequestMapping("/join")
	public String doJoin()
	{
		return "userController:doJoin";
	}
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(@RequestParam(value="email", required=true, defaultValue="") String email)
	{
		return "/WEB-INF/views/login.jsp";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute UserVo userVo)//userVo에 같은 속성(email,password) getter,setter가 존재해야 한다.
	{
		System.out.println(userVo);
		return "redirect:/main";
	}

}
