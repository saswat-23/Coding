package com.codingpractice.java8.fi.consumer;

import java.util.List;
import java.util.function.BiConsumer;

import com.codingpractice.java8.data.Student;
import com.codingpractice.java8.data.StudentDB;

public class BiConsumerExample {

	static List<Student> studentList = StudentDB.getAllStudents();
	
	public static void main(String[] args) {
		
		//Implementation for the abstract method 'accept' is provided.
		BiConsumer<String, List<String>> studentBiConsumer1 = (name, activities) -> {System.out.println("name: "+name+"\t"+activities);};

		//StudentList is iterated and the implementation of accept method for each student is executed.
		studentList.forEach((student)-> studentBiConsumer1.accept(student.getName(), student.getActivities()));
		
	}
}
