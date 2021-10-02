package com.azam.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azam.common.ICommonService;
import com.azam.dao.RoleDao;
import com.azam.model.Role;

@Service
public class RoleService implements ICommonService<Role>{
	@Autowired
	RoleDao roleDao;
	@Override
	public Role save(HttpServletRequest request) {
		
	        Role r = new Role();
	        r.setRole_name(request.getParameter("role_name"));
	        r.setRole_code(Integer.valueOf(request.getParameter("role_code")));
	       
	        return roleDao.save(r);
	}

	@Override
	public Role edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
