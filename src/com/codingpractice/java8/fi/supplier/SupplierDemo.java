package com.codingpractice.java8.fi.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.codingpractice.java8.data.Student;
import com.codingpractice.java8.data.StudentDB;

public class SupplierDemo {

	public static void main(String[] args) {

		
		Supplier<Student> studentSupplier = ()->{
			return new Student("Saswat", 3, 8.76, "Male", Arrays.asList("Walking, Playing, Watching TV"));
		};
		
		System.out.println(studentSupplier.get());
		
		// Return the list of students
		Supplier<List<Student>> studentListSupplier = () ->{
			return StudentDB.getAllStudents();
		};
		
		System.out.println("StudentList:\n"+studentListSupplier.get());
	}

}
