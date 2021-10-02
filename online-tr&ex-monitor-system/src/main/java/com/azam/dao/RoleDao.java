package com.azam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.azam.common.ICommonDAO;
import com.azam.model.Role;


@Repository(value = "roleDao")
@Transactional
public class RoleDao implements ICommonDAO<Role>{

	
	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
    
    
	public Role save(Role r) {
		getSession().save(r);
    	getSession().flush();
        return r;
	}

	@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role update(Role t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Role t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
