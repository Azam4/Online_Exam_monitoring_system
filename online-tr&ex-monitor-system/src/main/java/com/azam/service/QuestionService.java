package com.azam.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azam.common.ICommonService;
import com.azam.dao.QuestionDao;

import com.azam.model.Question;
import com.azam.model.Results;


@Service
public class QuestionService implements ICommonService<Question>{
	@Autowired
	QuestionDao questionDao;
	@Override
	public Question save(HttpServletRequest request) {
		Question q = new Question();
        q.setQuestionText(request.getParameter("questionText"));    
        q.setA(request.getParameter("a"));
        q.setB(request.getParameter("b"));
        q.setC(request.getParameter("c"));
        q.setD(request.getParameter("d"));
        q.setCorrect(request.getParameter("correct"));
        q.setQuestion_code(request.getParameter("question_code"));
        q.setCourse_name(request.getParameter("course_name"));        
        q.setCourse_code(request.getParameter("course_code"));
        //System.out.println(request.getParameter("course_name"));
        //System.out.println(request.getParameter("course_code"));
        
        return questionDao.save(q);
	}

	@Override
	public Question edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Question update(HttpServletRequest request) {
		
	        Question q = new Question();
	        q.setId(Integer.valueOf(request.getParameter("id")));
	        q.setA(request.getParameter("a"));
	        q.setB(request.getParameter("b"));
	        q.setC(request.getParameter("c"));
	        q.setD(request.getParameter("d"));
	        q.setQuestionText(request.getParameter("questionText"));
	        //q.setCourse_code(request.getParameter("course_code"));
	        //q.setCourse_name(request.getParameter("course_name"));
	        q.setQuestion_code(request.getParameter("question_code"));
	        q.setCorrect(request.getParameter("correct"));
	        return questionDao.update(q);
	}

	@Override
	public List<Question> getAll() {
		
		return questionDao.getAll();
	}
	
	

	@Override
	public int delete(String id) {
		Question q = questionDao.getById(Integer.valueOf(id));
        return questionDao.delete(q);
	}

	public List<Question> starq(String courseCode) {
		
		return questionDao.starq(courseCode);
	}
	

	public Question getById(String qid) {
		
		return questionDao.getById(Integer.valueOf(qid));
	}

	public void saveResult(HttpServletRequest request, List<Question> questions1, int correct, int incorrect) {
		Results r = new Results();
		
		String correctAns = null;
		
		for (int i = 0; i < questions1.size(); i++) {
			correctAns += questions1.get(i).getCorrect()+" ";
		}
		
		r.setRight_ans(correct);
		r.setWrong_ans(incorrect);
		r.setAllcorrectAns(correctAns);
		
		r.setUserName(request.getParameter("username"));
		
		questionDao.saveResult(r);
		
	}

	

	public List<Results> getResult(String username) {
		// TODO Auto-generated method stub
		return questionDao.getResult(username);
	}

	public List<Results> getAlll() {
		
		return questionDao.getAlll();
	}


}
