package com.azam.Controllar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.azam.common.ICommonController;
import com.azam.model.Role;
import com.azam.service.RoleService;

@RestController
@RequestMapping(value = "role")

public class RoleControllar implements ICommonController{
	@Autowired
	RoleService roleService;
	@Override
	@RequestMapping(value = "/add")
	public ModelAndView create() {
		
		return new ModelAndView ("role/Addrole");
	}

	@Override
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request) {
		Role r = roleService.save(request);
        return new ModelAndView("role/Addrole");
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
