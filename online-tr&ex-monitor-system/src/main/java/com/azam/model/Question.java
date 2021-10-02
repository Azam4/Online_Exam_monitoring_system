package com.azam.model;

import javax.persistence.*;

@Entity(name="question")
@Table(name="questions")
public class Question {

    @Id  
    @Column(name = "id")
    private int id;
    @Column(name = "course_name")
    private String course_name;
    
    @Column(name = "course_code")
    private String course_code;

    @Column(name = "question")
    private String questionText;
    
    @Column(name = "QUESTION_CODE")
    private String question_code;

    @Column(name = "A")
    private String a;

    @Column(name = "B")
    private String b;

    @Column(name = "C")
    private String c;

    @Column(name = "D")
    private String d;

    @Column(name = "Correct")
    private String correct;

    public Question() {
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getCourse_code() {
		return course_code;
	}

	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String getQuestion_code() {
		return question_code;
	}

	public void setQuestion_code(String question_code) {
		this.question_code = question_code;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public String getCorrect() {
		return correct;
	}

	public void setCorrect(String correct) {
		this.correct = correct;
	}
    
    

  



}
