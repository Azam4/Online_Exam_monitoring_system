package com.azam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.azam.model.Examname;
import com.azam.model.Results;
import com.azam.model.User;
import com.azam.service.impl.ResultsServicesImpl;

@Service
public class ResultService implements ResultsServicesImpl{

	@Override
	public List<Results> findByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Results> findByQuiz(Examname quiz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveResultToDB(Results result) {
		// TODO Auto-generated method stub
		
	}

}
