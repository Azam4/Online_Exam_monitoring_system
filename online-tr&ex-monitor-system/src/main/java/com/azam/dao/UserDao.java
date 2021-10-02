package com.azam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.azam.common.ICommonDAO;

import com.azam.model.Role;
import com.azam.model.User;


@Repository(value = "userDao")
@Transactional

public class UserDao implements ICommonDAO<User>{

	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	
	
	
	@Override
	public User save(User u) {
		getSession().save(u);
    	getSession().flush();
        return u;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(User t) {
		// TODO Auto-generated method stub
		return 0;
	}



	public List<Role> rolevalu() {
		String sql = "from role";
		List<Role> role = getSession().createQuery(sql).list();
		return role;
	}



	public User login(User u) {
		System.out.println(u.getSortname() + "     ...........................");
		 String sql = "from user where sortname = '" + u.getSortname() + "'";
	        List<User> user = getSession().createQuery(sql).list();
	        return user.get(0);
	}
	

	/*
	 * public List<Role> rolevalu() { String sql = "from Role"; List<Role> role =
	 * getSession().createQuery(sql).list(); return role;
	 * 
	 * }
	 */
}
