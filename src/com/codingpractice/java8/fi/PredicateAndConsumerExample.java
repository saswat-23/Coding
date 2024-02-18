package com.codingpractice.java8.fi;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

import com.codingpractice.java8.data.Student;
import com.codingpractice.java8.data.StudentDB;

public class PredicateAndConsumerExample {

	static List<Student> studentList = StudentDB.getAllStudents();
	
	static Predicate<Student> predicateGrade = (student) -> student.getGradeLevel()==1;
	static Predicate<Student> predicateGpa = (student) -> student.getGpa()>1;
	
	public static void main(String[] args) {
		
		// BiConsumer declared to print the Student Name and Activities
		BiConsumer<String, List<String>> studentNameActivitiesBiConsumer 
		= (sname, sactivities)->System.out.println("Name: "+sname+",\tActivities: "+sactivities);
		
		
		// This combination of Consumer and Predicate will print the Name and Activities of those students 
		//whose criteria is mentioned in the predicates declared above
		studentList.forEach(student->{
			if(predicateGrade.and(predicateGrade).test(student)) {
				studentNameActivitiesBiConsumer.accept(student.getName(), student.getActivities());
			}
		});
		
	}

}
