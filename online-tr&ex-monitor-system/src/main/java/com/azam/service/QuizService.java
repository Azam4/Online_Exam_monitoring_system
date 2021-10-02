package com.azam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.azam.model.Categories;
import com.azam.model.Question;
import com.azam.model.Examname;
import com.azam.service.impl.QuizServiceImpl;

@Service
public class QuizService implements QuizServiceImpl{

	@Override
	public Question findQuestionById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addQuestionToDB(Question question) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean validateAnswer(String answer, String correctAnswer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Examname findQuizById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addQuizToDB(Examname quiz) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Examname createNewQuiz(String quizName, Categories category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveQuiz(Examname quiz) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Examname> listAllQuiz() {
		// TODO Auto-generated method stub
		return null;
	}

}
