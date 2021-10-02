package com.azam.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azam.common.ICommonService;
import com.azam.dao.CategoriesDao;
import com.azam.dao.UserDao;
import com.azam.model.Categories;
import com.azam.model.Role;
import com.azam.model.User;

@Service
public class UserService implements ICommonService<User>{
	@Autowired
	UserDao userDao;
	
	@Override
	public User save(HttpServletRequest request) {
		
		User u = new User();
		
	      u.setName(request.getParameter("name"));
	      u.setSortname(request.getParameter("sortname"));
	    u.setRole_name(request.getParameter("role_name"));
	    u.setRole_code(request.getParameter("role_code"));
	    u.setEmail(request.getParameter("email"));
	    u.setPassword(request.getParameter("password"));
	        
	    	return userDao.save(u);
	}  	
	    	
	@Override
	public User edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public List<Role> rolevalu() {
		// TODO Auto-generated method stub
		return userDao.rolevalu();
	}

	public User login(HttpServletRequest request) {
		User u = new User();
		System.out.println(request.getParameter("username"));
		u.setSortname(request.getParameter("username"));
		u.setPassword(request.getParameter("password"));
		u.setRole_name(request.getParameter("role_name"));
		u.setRole_code(request.getParameter("role_code"));
		return userDao.login(u);
	}

}
