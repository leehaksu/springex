package com.jx372.springex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	/* method 단독 매핑(화면에 바로 뿌려준다.)*/
	@ResponseBody
	/* 주소 맵핑*/
	@RequestMapping("/main")
	public String Main()
{
	return "MainContoller:main";
}

	@ResponseBody
	@RequestMapping("/main2/leehacsksue/a/b")
	public String Main2()
{
	return "MainContoller:main";
}

}
