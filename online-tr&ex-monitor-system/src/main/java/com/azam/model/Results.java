package com.azam.model;

import javax.persistence.*;


@Entity(name="results")
@Table(name = "userresult")
public class Results {

    @Id
    @Column(name = "id")
    private int id;
    
    @Column(name="result_code")
    private String result_code;
    
    @Column(name="userName")
    private String userName;
    
    @Column(name="course_code")
    private String  course_code;
    
    @Column(name="course_name")
    private String course_name;
    
    @Column(name="right_ans")
    private int right_ans;
    
    @Column(name="wrong_ans")
    private int wrong_ans;
    
    @Column(name="total_marks")
    private String total_marks;
    
    @Column(name="allcorrectAns")
    private String allcorrectAns;

	public Results() {
		
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getResult_code() {
		return result_code;
	}

	public void setResult_code(String result_code) {
		this.result_code = result_code;
	}

	public String getCourse_code() {
		return course_code;
	}

	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getRight_ans() {
		return right_ans;
	}

	public void setRight_ans(int right_ans) {
		this.right_ans = right_ans;
	}

	public int getWrong_ans() {
		return wrong_ans;
	}

	public void setWrong_ans(int wrong_ans) {
		this.wrong_ans = wrong_ans;
	}

	public String getTotal_marks() {
		return total_marks;
	}

	public void setTotal_marks(String total_marks) {
		this.total_marks = total_marks;
	}

	public String getAllcorrectAns() {
		return allcorrectAns;
	}

	public void setAllcorrectAns(String allcorrectAns) {
		this.allcorrectAns = allcorrectAns;
	}

    
    
}
