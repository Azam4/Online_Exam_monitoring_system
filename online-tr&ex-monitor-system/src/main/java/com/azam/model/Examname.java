package com.azam.model;






import java.util.Date;

import javax.persistence.*;



@Entity(name="examname")
@Table(name = "examname")
public class Examname {
    @Id
  
    @Column(name = "id")
    private int id;
    
    @Column(name = "ex_name")
    private String ex_name;
    
    @Column(name = "ex_code")
    private String ex_code;
    
    @Column(name = "course_name")
    private String course_name;
    
    @Column(name = "course_code")
    private String course_code;
    
    @Column(name = "start_date")
    private Date start_date;
    
    @Column(name = "end_date")
    private Date end_date;
    
    @Column(name = "total_mark")
    private String total_mark;

	public Examname() {
	
	}

	public Date getStart_date() {
		return start_date;
	}



	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}



	public Date getEnd_date() {
		return end_date;
	}



	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEx_name() {
		return ex_name;
	}

	public void setEx_name(String ex_name) {
		this.ex_name = ex_name;
	}

	public String getEx_code() {
		return ex_code;
	}

	public void setEx_code(String ex_code) {
		this.ex_code = ex_code;
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



	public String getTotal_mark() {
		return total_mark;
	}

	public void setTotal_mark(String total_mark) {
		this.total_mark = total_mark;
	}
    
    
	
  
	
}
