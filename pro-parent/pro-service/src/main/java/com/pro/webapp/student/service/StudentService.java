package com.pro.webapp.student.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.webapp.student.dao.StudentDao;
import com.pro.webapp.student.model.Student;

@Service("studentService")
public class StudentService {

	@Resource
	private StudentDao studentDao;
	
	public List<Student> getstu(){
		
	 List<Student> list=	studentDao.getStu();
		return list;
	}
	
}
