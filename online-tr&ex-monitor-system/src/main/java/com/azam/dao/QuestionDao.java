package com.azam.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.azam.common.ICommonDAO;
import com.azam.model.Question;
import com.azam.model.Results;




@Repository(value = "questionDao")
@Transactional
public class QuestionDao implements ICommonDAO<Question>{

	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	
	
	@Override
	public Question save(Question q) {
		getSession().save(q);
    	getSession().flush();
        return q;
	}

	@Override
	public List<Question> getAll() {
		String sql = "from question";
        List<Question> questions = getSession().createQuery(sql).list();
        return questions;
	}

	@Override
	public Question getById(int qid) {
		String sql = "from question where id = '" + qid + "'";
        List<Question> quList = getSession().createQuery(sql).list();
        return quList.get(0);
	}

	@Override
	public Question update(Question q) {
		/*
		 * String sql = "update question set questionText = '"+q.getQuestionText()
		 * +"', question_code = '"+q.getQuestion_code()+"', " +
		 * "course_name = '"+q.getCourse_name()+"', course_code = '"
		 * +q.getCourse_code()+"'," + " a = '" +q.getA()+"', b = '" +q.getB()+"', c = '"
		 * +q.getC()+"', d = '" +q.getD()+"', " +
		 * "'correct = '"+q.getCorrect()+"' where id = '"+q.getId()+"'"; Query p =
		 * getSession().createQuery(sql); p.executeUpdate(); getSession().flush();
		 * return q;
		 */
		getSession().update(q);
    	getSession().flush();
        return q;
	}

	@Override
	public int delete(Question q) {
		String sql = "delete question where id = '"+q.getId()+"'";
        int delete = getSession().createQuery(sql).executeUpdate();
        return delete;
	}


	public List<Question> starq(String courseCode) {
		String sql = "from question where course_code = '"+courseCode+"'";
        List<Question> questions1 = getSession().createQuery(sql).list();
        return questions1;
	}


	public Question findId(int qid) {
		String sql = "from question where id = '"+qid+"' ";
		Question q =  (Question) getSession().createQuery(sql).uniqueResult();
		return q;
	}


	public Question edit(int qid) {
		
		 String sql = "from question where id = '" + qid + "'";
	        List<Question> questionList = getSession().createQuery(sql).list();
	        return questionList.get(0);

	}


	public void saveResult(Results r) {
		getSession().save(r);
    	getSession().flush();
		
	}


	public List<Results> getResult(String username) {
		 String sql = "from results where userName = '"+username+"' ";
	        List<Results> resultsList = getSession().createQuery(sql).list();
	        return resultsList;
	}


	public List<Results> getAlll() {
		String sql = "from results ";
        List<Results> resultsallu = getSession().createQuery(sql).list();
        return resultsallu;
	}




}
