package com.azam.model;

import javax.persistence.*;

@Entity(name = "course")
@Table(name = "course")
public class Course {
	@Id  
	 @Column(name = "id")
    private int id;
	
	@Column(name = "Course_code")
	private String course_code;
	
	@Column(name = "Course_name")
    private String course_name;

  
    
    

	public Course() {
	
	}


	


	public Course(int id, String course_code, String course_name) {
		super();
		this.id = id;
		this.course_code = course_code;
		this.course_name = course_name;
	}





	public String getCourse_name() {
		return course_name;
	}





	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}





	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getCourse_code() {
		return course_code;
	}


	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}



	
	
	}
