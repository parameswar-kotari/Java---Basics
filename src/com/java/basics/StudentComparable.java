package com.java.basics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparable implements Comparable<StudentComparable>{
	public StudentComparable(Integer id, String firstName, String lastname) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
	}
	private Integer id;
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
	@Override
	public int compareTo(StudentComparable student) {
		// TODO Auto-generated method stub
		int result=this.getId().compareTo(student.getId());
		return result;
	}
	public static void main(String args[])
	{
		List<StudentComparable> students=new ArrayList<>();
		students.add(new StudentComparable(3000,"ABC","XYZ"));
		students.add(new StudentComparable(124,"ABC","X"));
		students.add(new StudentComparable(1,"XYZ","ABC"));
		students.add(new StudentComparable(5000,"XYZ","XYZ"));
		students.add(new StudentComparable(127,"ABC","XYZ"));
		Collections.sort(students);
		for(StudentComparable s:students)
		{
			System.out.println(s.getId() +"  "+s.getFirstName()+"  "+s.getLastname());
		}
	}
	

}
