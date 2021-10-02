package com.azam.model;


import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Categories {

	 @Id  
	 @Column(name = "id")
	 private int id;
	 
	 @Column(name = "Catego_code")
	 private String catego_code;
	 
	 @Column(name = "Catego_name")
    private String catego_name;

    public Categories() {
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCatego_code() {
		return catego_code;
	}

	public void setCatego_code(String catego_code) {
		this.catego_code = catego_code;
	}

	public String getCatego_name() {
		return catego_name;
	}

	public void setCatego_name(String catego_name) {
		this.catego_name = catego_name;
	}


	
  
}
