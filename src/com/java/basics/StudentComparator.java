package com.java.basics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students=new ArrayList<>();
		students.add(new Student(3000,"ABC","XYZ"));
		students.add(new Student(124,"ABC","X"));
		students.add(new Student(1,"XYZ","ABC"));
		students.add(new Student(5000,"XYZ","XYZ"));
		students.add(new Student(127,"ABC","XYZ"));
		Collections.sort(students,new ComparatorByFirstName()
							.thenComparing(new ComparatorByLastName()));
		for(Student s:students)
		{
			System.out.println(s.getId() +"  "+s.getFirstName()+"  "+s.getLastname());
		}
	}

}
