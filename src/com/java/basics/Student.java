package com.java.basics;

public class Student {
	private Integer id;
	public Student(Integer id, String firstName, String lastname) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
	}
	private String firstName;
	private String lastname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
