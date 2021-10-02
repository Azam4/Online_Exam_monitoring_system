package com.azam.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azam.common.ICommonService;
import com.azam.dao.CategoriesDao;
import com.azam.dao.CourseDao;
import com.azam.model.Categories;
import com.azam.model.Course;
@Service
public class CourseService implements ICommonService<Course>{
	@Autowired
	CourseDao courseDao;
	@Override
	public Course save(HttpServletRequest request) {
		Course c = new Course();
        c.setCourse_name(request.getParameter("course_name"));
        c.setCourse_code(request.getParameter("course_code"));
       
        return courseDao.save(c);
		
	}

	@Override
	public Course edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return courseDao.getAll();
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
