package com.codingpractice.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.codingpractice.java8.data.Student;
import com.codingpractice.java8.data.StudentDB;

public class StreamExample {

	public static void main(String[] args) {

		Predicate<Student> studentLevelPredicate = (student)->student.getGpa()>9;
		
		Map<String, List<String>> studentMap = StudentDB.getAllStudents().stream()
		.collect(Collectors.toMap((student)->student.getName(), (student)->student.getActivities()));
		
		Map<String, List<String>> studentMap2 = StudentDB.getAllStudents().stream()
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		Map<String, List<String>> studentMap3 = StudentDB.getAllStudents()
				.stream()
				.filter((student)->student.getGradeLevel()>2)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		Map<String, List<String>> studentMap4 = StudentDB.getAllStudents()
				.stream()
				.filter((student)->student.getGradeLevel()>2)
				.filter(studentLevelPredicate)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		System.out.println(studentMap4);
	}

}
