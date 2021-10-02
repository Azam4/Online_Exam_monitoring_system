package com.azam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.azam.common.ICommonDAO;
import com.azam.model.Course;


@Repository(value = "courseDao")
@Transactional
public class CourseDao implements ICommonDAO<Course>{

	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	
	
	@Override
	public Course save(Course c) {
		getSession().save(c);
    	getSession().flush();
        return c;
	}

	@Override
	public List<Course> getAll() {
		String sql = "from course";
        List<Course> course = getSession().createQuery(sql).list();
        return course;
	}

	@Override
	public Course getById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course update(Course t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Course t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
