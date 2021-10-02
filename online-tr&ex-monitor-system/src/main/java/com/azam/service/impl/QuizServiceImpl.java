package com.azam.service.impl;


import java.util.List;

import com.azam.model.Categories;
import com.azam.model.Question;
import com.azam.model.Examname;

public interface QuizServiceImpl {



    Question findQuestionById(int id);

    void addQuestionToDB(Question question);

    boolean validateAnswer(String answer, String correctAnswer);

    Examname findQuizById(int id);

    void addQuizToDB(Examname quiz);

    Examname createNewQuiz(String quizName, Categories category);

    void saveQuiz(Examname quiz);

    List<Examname> listAllQuiz();



}
