package com.azam.Controllar;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.azam.common.ICommonController;
import com.azam.model.Course;
import com.azam.model.Role;
import com.azam.model.User;
import com.azam.service.CourseService;
import com.azam.service.UserService;


@RestController
@RequestMapping(value = "user")
public class UserControllar implements ICommonController{
	@Autowired
	UserService userService;
	
	@Autowired
	CourseService courseService;
	
	
	
	
	@Override
	@RequestMapping(value = "/add")
	public ModelAndView create() {
		return new ModelAndView ("user/Adduser");
		
	}

	@Override
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request) {
		User u = userService.save(request);
        return new ModelAndView("user/Adduser");
	}

	@RequestMapping(value = "/add2", method = RequestMethod.GET)
	public ModelAndView rolevalu() {
		
		List<Role> roles = userService.rolevalu();
	
		return new ModelAndView("user/Adduser", "roles", roles);
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
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, ModelMap map) {

		User u = userService.login(request);
	
		//&& request.getParameter("role_name").equals(u.getRole_name())
		
		if(request.getParameter("username").equals(u.getSortname().toString()) && request.getParameter("password").equals(u.getPassword().toString())) {
			map.addAttribute("name", u.getName());
			map.addAttribute("email", u.getEmail());
			map.addAttribute("role_name", u.getRole_name());
			map.addAttribute("role_code", u.getRole_code());
			List<Course> courses = courseService.getAll();
			map.addAttribute("courses", courses);
			List<Role> roles = userService.rolevalu();
			
			return new ModelAndView("user/ulogafter", "roles", roles);
		}else {
			return new ModelAndView("user/error");
		}
		
	}

}
//ulogafter
