package com.azam.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name ="user")
@Table(name = "user")

public class User {



    @Id
    @Column(name = "ID")
    private int id;

   
    @Column(name="NAME")
    private String name;

    @Column(name="SORTNAME")
    private String sortname;

    @Column(name="ROLE_NAME")
    private String role_name;
    
    @Column(name="ROLE_CODE")
    private String role_code;

    @Column(name="PASSWORD")
    private String password;

    @Column(name="EMAIL")
 
    
    private String email;

 

    public User() {
    }



	public User(int id, String name, String sortname, String role_name, String role_code, String password,
			String email) {
		super();
		this.id = id;
		this.name = name;
		this.sortname = sortname;
		this.role_name = role_name;
		this.role_code = role_code;
		this.password = password;
		this.email = email;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSortname() {
		return sortname;
	}



	public void setSortname(String sortname) {
		this.sortname = sortname;
	}



	public String getRole_name() {
		return role_name;
	}



	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}



	


	public String getRole_code() {
		return role_code;
	}



	public void setRole_code(String role_code) {
		this.role_code = role_code;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}

    
    




}
