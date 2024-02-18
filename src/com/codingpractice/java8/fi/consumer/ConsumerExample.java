package com.codingpractice.java8.fi.consumer;

import java.util.List;
import java.util.function.Consumer;

import com.codingpractice.java8.data.Student;
import com.codingpractice.java8.data.StudentDB;

public class ConsumerExample {
	
	public static void main(String[] args) {
		
//		Consumer<String> consumer1 = (s)-> System.out.println(s.toUpperCase());
//		consumer1.accept("functionalinterface");
		
		List<Student> studentList = StudentDB.getAllStudents();

		//Prints all the students with all the details
		Consumer<Student> studentConsumer1 = (student) -> System.out.println(student.toString());
		
		Consumer<Student> studentConsumer2 = (student) -> {System.out.print(student.getName());};
		Consumer<Student> studentConsumer3 = (student) -> {System.out.println(student.getActivities());};
		
		
		
		//Prints all the students with all the details
//		studentList.forEach(studentConsumer1);
		
		// Consumer chaining to get the Name and Activities
//		studentList.forEach(studentConsumer2.andThen(studentConsumer3));
		
		//Another Approach:
		studentList.forEach((student)->{
			if(student.getGradeLevel()>2) {
				studentConsumer2.andThen(studentConsumer3).accept(student);
			}
		});
		
		System.out.println("Program ends...");
	}
}
