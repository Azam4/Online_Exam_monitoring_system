package com.azam.service;



import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azam.common.ICommonService;
import com.azam.dao.ExamDao;

import com.azam.model.Course;
import com.azam.model.Examname;



@Service
public class ExamService implements ICommonService<Examname>{

	@Autowired
	ExamDao examDao;
	
	@Override
	public Examname save(HttpServletRequest request) {
		Examname e = new Examname();
        e.setCourse_name(request.getParameter("course_name"));
        System.out.println(e.getCourse_name());
        e.setCourse_code(request.getParameter("course_code"));
       System.out.println(e.getCourse_code());
        e.setEx_name(request.getParameter("ex_name"));
        e.setEx_code(request.getParameter("ex_code"));
        e.setTotal_mark(request.getParameter("total_mark"));
        
        java.sql.Date date = Date.valueOf(request.getParameter("start_date"));
        e.setStart_date(date);
        java.sql.Date date1 = Date.valueOf(request.getParameter("end_date"));
        e.setEnd_date(date1);

       
        return examDao.save(e);
	}

	@Override
	public Examname edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Examname update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Examname> getAll() {
		
		
		
		return examDao.getAll();
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Course> coursevalu() {
		
		return examDao.coursevalu();
	}

}
