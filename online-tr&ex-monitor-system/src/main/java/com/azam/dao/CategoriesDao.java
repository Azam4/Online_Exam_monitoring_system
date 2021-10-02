package com.azam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.azam.common.ICommonDAO;
import com.azam.model.Categories;


@Repository(value = "categoriesDao")
@Transactional

public class CategoriesDao implements ICommonDAO<Categories>{


    @Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	
	@Override
	public Categories save(Categories c) {
		getSession().save(c);
    	getSession().flush();
        return c;
	}

	@Override
	public List<Categories> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categories getById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categories update(Categories t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Categories t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
