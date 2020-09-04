package com.cjc2;

public class ConstructorDemo {

	public ConstructorDemo(){
		
		System.out.println("Constructor--A");
	}
	
	static{
	    System.out.println("Static---Block");   	
	      }
	
	public static void main(String[] args) {
		
		System.out.println("Main Method");
		ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo cd1=new ConstructorDemo();
	}
}
