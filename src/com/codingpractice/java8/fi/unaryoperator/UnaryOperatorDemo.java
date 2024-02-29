package com.codingpractice.java8.fi.unaryoperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	static UnaryOperator<String> unaryOp1 = (str)-> str.concat("JAVA8_UNARY_OPERATOR");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(unaryOp1.apply("SampleString1 == "));
	}

}
