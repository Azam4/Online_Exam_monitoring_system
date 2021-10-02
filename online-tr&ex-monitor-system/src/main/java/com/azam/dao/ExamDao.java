package com.azam.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.azam.common.ICommonDAO;
import com.azam.model.Course;
import com.azam.model.Examname;



@Repository(value = "examDao")
@Transactional
public class ExamDao implements ICommonDAO<Examname>{

	 @Autowired
	    private EntityManager entityManager;
	 
	    
	    private Session getSession() {
	        return entityManager.unwrap(Session.class);
	    }
		
	
	@Override
	public Examname save(Examname e) {
		
		getSession().save(e);
    	getSession().flush();

		System.out.println(e.getCourse_name());
		System.out.println(e.getCourse_code());
        return e;
	}

	@Override
	public List<Examname> getAll() {		
		String sql = "from examname";
        List<Examname> examnames = getSession().createQuery(sql).list();
        return examnames;
	}

	@Override
	public Examname getById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Examname update(Examname t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Examname t) {
		// TODO Auto-generated method stub
		return 0;
	}


	public List<Course> coursevalu() {
		String sql = "from course";
        List<Course> course = getSession().createQuery(sql).list();
        return course;

	}

}
