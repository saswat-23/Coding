package com.codingpractice.java8.fi.function;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		
		Function<String, String> function1 = (str)->str.toUpperCase();
		Function<String, String> function2 = (str)->str.toLowerCase().concat(" OnLine");
		
		String dataString = "I Am Learning Java8";
		
		System.out.println("Apply Result is: "+function1.apply(dataString));
		
		//First function1, then function2 is applied on the input text
		//First text within apply method is converted to UPPERCASE (as per function1)
		//then the UPPERCASE string is passed to function2, is converted to lowercase and "OnLine" is concatenated.
		System.out.println("And-Then Result is: "+function1.andThen(function2).apply(dataString));
		
		//First function2, then function1 is applied on the input text
		//First text within apply method is converted to lowercase (as per function1) and "OnLine" is concatenated.
		//then the concatenated string is passed to function1, is converted to UPPERCASE.
		System.out.println("Compose Result is: "+function1.compose(function2).apply(dataString));
		
	}

	
}
