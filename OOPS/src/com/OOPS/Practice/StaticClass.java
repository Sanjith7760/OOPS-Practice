package com.OOPS.Practice;

public class StaticClass {

	static int a =10;
	static {
		System.out.println("Static block is executing");
		System.out.println("a = "+a);
		a=20;
	}
	public static void main(String[] args) {
		System.out.println("Main method is executing");
		System.out.println("a = "+a);
	}

}
