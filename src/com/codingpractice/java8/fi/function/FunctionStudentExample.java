package com.codingpractice.java8.fi.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.codingpractice.java8.data.Student;
import com.codingpractice.java8.data.StudentDB;
import com.codingpractice.java8.fi.predicate.BiPredicateStudentExample;

public class FunctionStudentExample {

	static Function<List<Student>,Map<String, Double>> studentFunction1 = (studentList)->{
		
		Map<String, Double> studentGrades=new HashMap<String, Double>();
		
		studentList.forEach((student)->{
			//Select only those students where GradeLevel>2 and GPA>8
			if(BiPredicateStudentExample.biPredicateGradeGpa.test(student.getGradeLevel(), student.getGpa())) {
				studentGrades.put(student.getName(), student.getGpa());
			}
		});
		
		return studentGrades;
	}; 
	
	public static void main(String[] args) {

		System.out.println(studentFunction1.apply(StudentDB.getAllStudents()));
		
	}

	
}
