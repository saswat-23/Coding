package com.codingpractice.java8.fi.unaryoperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	static Comparator<Integer> compartor1 = (a,b)-> a.compareTo(b);
	static BinaryOperator<Integer> binaryOp1 = (a,b)-> a+b;
	
	public static void main(String[] args) {
		
//		System.out.println(binaryOp1.apply(5, 19));
		
		BinaryOperator<Integer> binaryOpMaxBy = BinaryOperator.maxBy(compartor1);
		//Returns the value which is greater
		System.out.println("Result of MaxBy: "+binaryOpMaxBy.apply(10, 21));
		
		BinaryOperator<Integer> binaryOpMinBy = BinaryOperator.minBy(compartor1);
		//Returns the value which is greater
		System.out.println("Result of MinBy: "+binaryOpMinBy.apply(10, 21));
	}

}
