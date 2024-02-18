package com.codingpractice.java8.fi.predicate;

import java.util.List;
import java.util.function.Predicate;

import com.codingpractice.java8.data.Student;
import com.codingpractice.java8.data.StudentDB;

public class PredicateStudentExample {

	static List<Student> studentList = StudentDB.getAllStudents();
	
	static Predicate<Student> predicateGrade = (student) -> student.getGradeLevel()>=2;
	static Predicate<Student> predicateGpa = (student) -> student.getGpa()>8;
	
	public static void main(String[] args) {
		
		System.out.println("Students filtered by Grade Level only: ");
		studentList.forEach((student)->{
			if(predicateGrade.test(student))
			System.out.println(student);
		});
		
		System.out.println("\nStudents filtered by GPA only: ");
		studentList.forEach((student)->{
			if(predicateGpa.test(student))
			System.out.println(student);
		});
		
		System.out.println("\nStudents filtered by both Grade Level and GPA: ");
		studentList.forEach((student)->{
			if(predicateGrade.and(predicateGpa).test(student))
			System.out.println(student);
		});
		
		System.out.println("\nStudents inversely filtered by both Grade Level and GPA: ");
		studentList.forEach((student)->{
			if(predicateGrade.and(predicateGpa).negate().test(student))
			System.out.println(student);
		});
		
	}
	
	

}
