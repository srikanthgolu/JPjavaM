package com.JavaBasics;

public class JavaVariables {

	int a=12; //inside a class but outside of the method, instance variable
	static String str = "java";
	void sum(int x,int y) {
	System.out.println(x+y);
	}
	public static void main(String[] args) {
		JavaVariables obj = new JavaVariables();
		obj.sum(18, 20);
		System.out.println(obj.a);
		System.out.println(str);
		
				
				
				
				

	}

}
