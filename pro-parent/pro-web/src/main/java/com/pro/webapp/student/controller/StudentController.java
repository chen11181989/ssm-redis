package com.pro.webapp.student.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.pro.webapp.student.model.Student;
import com.pro.webapp.student.service.StudentService;


@Controller
@RequestMapping("/user")
public class StudentController {
	@Resource
	private StudentService studentService;

	@ResponseBody
	@RequestMapping("/index")
	public String test() {
		System.out.println("wo lai le ");
		 List<Student> list = studentService.getstu();
		String json =JSON.toJSONString(list);
		return json;

	}
}
