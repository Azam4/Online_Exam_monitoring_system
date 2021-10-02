package com.azam.Controllar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.azam.common.ICommonController;

import com.azam.model.Course;
import com.azam.service.CourseService;

@RestController
@RequestMapping(value = "course")
public class CourseControllar implements ICommonController{

	@Autowired
	CourseService courseService;
	@Override
	@RequestMapping(value = "/add")
	
	public ModelAndView create() {
		
		return new ModelAndView ("quiz/AddCourse");
	}

	@Override
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request) {
		 Course c = courseService.save(request);
	        return new ModelAndView("quiz/AddCourse");
	}

	@Override
	public ModelAndView edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
