package com.OOPS.Practice;

class Parent{
	public static void fun() {
		System.out.println("Parent class");
	}
	public static void fun1() {
		System.out.println("Hello Java");
	}
}
class Child extends Parent{
	public static void fun() {
		System.out.println("Child class");
	}
	public static void greet() {
		System.out.println("Welcome to java");
	}
}


public class InheritanceJava {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.fun();
		p.fun1();
		
		
		Child c = new Child();
		c.fun();
		c.fun1();
		c.greet();
		
		Parent pp = new Child();
		pp.fun();
		pp.fun1();
	}

}
