package com.azam.service.impl;



import java.util.List;

import com.azam.model.Examname;
import com.azam.model.Results;
import com.azam.model.User;

public interface ResultsServicesImpl {

    List<Results> findByUser(User user);

    List<Results>findByQuiz(Examname quiz);

    void saveResultToDB(Results result);

}
