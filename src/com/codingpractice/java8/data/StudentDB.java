package com.codingpractice.java8.data;

import java.util.Arrays;
import java.util.List;

public class StudentDB {

	public static List<Student> getAllStudents() {
	
		Student student1 = new Student("Saswat", 2, 7.4, "Male", Arrays.asList("Cricket","Football","Sleeping"));
		Student student2 = new Student("Sarita", 3, 9.3, "Female", Arrays.asList("Dance","Singing","Art","Computer"));
		Student student3 = new Student("Lovely", 2, 6.1, "Female", Arrays.asList("Singing","Craft"));
		Student student4 = new Student("Gudu", 5, 8.5, "Female", Arrays.asList("Cooking","Singing","Travel"));
		Student student5 = new Student("Sanu", 1, 6.7, "Male", Arrays.asList("Gaming","Art","Electronics","Travelling"));
		
		List<Student> allStudents = Arrays.asList(student1, student2, student3, student4, student5);
		return allStudents ;
	}
	
}
