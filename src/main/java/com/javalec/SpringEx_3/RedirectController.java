package com.javalec.SpringEx_3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//������ �̵��� ���� redirect �̿� controller �ڹ� ����
@Controller
public class RedirectController {

	@RequestMapping("studentConfirm")
	public String studentRedirect(HttpServletRequest httpServletRequest, Model model) {
		
//		����ڰ� �Է��� ���� abc��� studentOk.jsp �������� �̵�
		String id = httpServletRequest.getParameter("id");
		if(id.equals("abc")) {
			return "redirect:studentOk";
		} 
//		�ƴϸ� studentNo.jsp �������� �̵�
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
	
	