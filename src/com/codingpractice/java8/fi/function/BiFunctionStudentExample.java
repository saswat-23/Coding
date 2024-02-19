package com.codingpractice.java8.fi.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.codingpractice.java8.data.Student;
import com.codingpractice.java8.data.StudentDB;
import com.codingpractice.java8.fi.predicate.PredicateStudentExample;

public class BiFunctionStudentExample {

	// BiFunction's apply method accepts 2 param and return 1
	// The 2nd param here is a Predicate (defined in another class) which is used to test student with grade > 2
	static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> studentBiFunction= 
			(studentList, studentGradePredicate)->{
				Map<String,Double> studentNameGpaMap = new HashMap<>();
				studentList.forEach((student)->{
					if(studentGradePredicate.test(student))
						studentNameGpaMap.put(student.getName(), student.getGpa());
				});
				return studentNameGpaMap;
			};
	
	public static void main(String[] args) {
		
		System.out.println(studentBiFunction.apply(StudentDB.getAllStudents(), 
				PredicateStudentExample.predicateGrade));
		
	}

}
