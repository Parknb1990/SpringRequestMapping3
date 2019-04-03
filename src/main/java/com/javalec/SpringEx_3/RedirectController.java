package com.javalec.SpringEx_3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//페이지 이동을 위한 redirect 이용 controller 자바 파일
@Controller
public class RedirectController {

	@RequestMapping("studentConfirm")
	public String studentRedirect(HttpServletRequest httpServletRequest, Model model) {
		
//		사용자가 입력한 값이 abc라면 studentOk.jsp 페이지로 이동
		String id = httpServletRequest.getParameter("id");
		if(id.equals("abc")) {
			return "redirect:studentOk";
		} 
//		아니면 studentNo.jsp 페이지로 이동
		return "redirect:studentNo";
		
	}



	@RequestMapping("studentOk")
	public String studentOk(Model model) {
		return "student/studentOk";
	}
	
	@RequestMapping("studentURL1")
	public String studentURL1(Model model) {
//		full name redirect
		return "redirect:http://localhot:8181/spring_2019_04_03_02/studentURL1.jsp";
	}
	
	@RequestMapping("studentURL2")
	public String studentURL2(Model model) {
		return "redirect:student/studentURL2";
	}
}
	
	