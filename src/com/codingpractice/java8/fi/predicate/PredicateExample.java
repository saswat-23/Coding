package com.codingpractice.java8.fi.predicate;

import java.util.function.Predicate;

public class PredicateExample {

	static Integer intToCheck = 10;
	
	static Predicate<Integer> predicateDivBy2 = (i) -> i%2==0;
	static Predicate<Integer> predicateDivBy5 = (i) -> i%5==0;
	static Predicate<Integer> predicateDivBy7 = (i) -> i%7==0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// Define the implementation of test(Tt) method of the Predicate Interface using lambda
		Predicate<Integer> predicate1 = (i) -> {return i%2==0;};

		//Syntax 2 - Lamdba without curly braces and return statement
		// Applicable only for single line statements.
		Predicate<Integer> predicate2 = (i) -> i%2==0;
		
		// Print the output of the test method
//		System.out.println(predicate2.test(intToCheck));
		
		// And Test
		predicateAndTest(7);	//false (as 7 is not divisble by both 2 and 5)
		predicateAndTest(10);	//true	(as 10 is divisible by both 2 and 5)
		
		
		// Or test
		predicateOrTest(7);		//false	(as 7 is not divisible by either 2 or 5)
		predicateOrTest(10);	//true	(as 10 is divisible by both 2 and 5)
		predicateOrTest(14);	//true	(as 14 is divisible by 2)
		
		// Negate test
		predicateNegateTest(10);	//false	(10 is divisible by both 2 and 5, but then the result is negated)
		
	}
	
	private static void predicateAndTest(Integer i) {
		System.out.println("Predicate AND result: "+predicateDivBy2.and(predicateDivBy5).test(i));
	}
	
	private static void predicateOrTest(Integer i) {
		System.out.println("Predicate OR result: "+predicateDivBy2.or(predicateDivBy5).test(i));
	}
	
	private static void predicateNegateTest(Integer i) {
		System.out.println("Predicate Negate result: "+predicateDivBy2.and(predicateDivBy5).negate().test(i));
	}
}
