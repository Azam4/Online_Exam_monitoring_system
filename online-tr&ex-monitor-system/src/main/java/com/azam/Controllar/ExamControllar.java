package com.azam.Controllar;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.azam.common.ICommonController;
import com.azam.model.Course;
import com.azam.model.Examname;

import com.azam.service.ExamService;




@RestController
@RequestMapping(value = "exam")
public class ExamControllar implements ICommonController{

	@Autowired
	ExamService examService;
	
	
	
	
	@RequestMapping(value = "/add")
	public ModelAndView create() {
		
		return new ModelAndView ("quiz/Addexam");
	}

	@Override
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request) {
		 Examname e = examService.save(request);
	        return new ModelAndView("quiz/Addexam");
	}
	
	@RequestMapping(value = "/add2", method = RequestMethod.GET)
	public ModelAndView coursevalu() {
		
		List<Course> courses = examService.coursevalu();
		
	
		return new ModelAndView("quiz/Addexam", "courses", courses);

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
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public ModelAndView getAll() {

		List<Examname> examnames = examService.getAll();
        return new ModelAndView("showall/showexam", "examnames", examnames);
		
	}
	
	

}
