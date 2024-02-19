package com.codingpractice.java8.fi.predicate;

import java.util.List;
import java.util.function.BiPredicate;

import com.codingpractice.java8.data.Student;
import com.codingpractice.java8.data.StudentDB;

public class BiPredicateStudentExample {

	static List<Student> studentList = StudentDB.getAllStudents();
	
	public static BiPredicate<Integer, Double> biPredicateGradeGpa = (gradeLevel, gpa) -> gradeLevel>=2 && gpa>8;
//	static BiPredicate<Integer, Double> predicateGpa = (student) -> student.getGpa()>8;	
	
	public static void main(String[] args) {
		
//		System.out.println("Students filtered by Grade Level only: ");
//		studentList.forEach((student)->{
//			if(biPredicateGradeGpa.test(student))
//			System.out.println(student);
//		});
//		
//		System.out.println("\nStudents filtered by GPA only: ");
//		studentList.forEach((student)->{
//			if(predicateGpa.test(student))
//			System.out.println(student);
//		});
		
		System.out.println("\nStudents filtered by both Grade Level and GPA: ");
		studentList.forEach((student)->{
			if(biPredicateGradeGpa.test(student.getGradeLevel(), student.getGpa()))
			System.out.println(student);
		});
		
		System.out.println("\nStudents inversely filtered by both Grade Level and GPA: ");
		studentList.forEach((student)->{
			if(biPredicateGradeGpa.negate().test(student.getGradeLevel(), student.getGpa()))
			System.out.println(student);
		});
		
	}
	
	

}
