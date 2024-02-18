package com.codingpractice.java8.fi;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
	
	/*
	 * For FunctionalInterface, one and only one abstract method must be present. (Mandatory)
	 * Any number of default methods may also be present. (Optional)
	 * */
	
	// Abstract Method (Mandatory)
	void demoAbstractMethodOne();
	
	// Default Method - 1 (Optional)
	default void demoDefaultMethodOne() {
		System.out.println("DemoDefaultMethod-One...");
	}
	
	// Default Method - 2 (Optional)
	default void demoDefaultMethodTwo() {
		System.out.println("DemoDefaultMethod-Two...");
	}
	
	
}
