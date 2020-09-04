package com.staticdemo;

public class MyClass {
	
	//   Static Method
	static void myStaticMethod(){
		
		System.out.println("Static Method Calls without creating object");
	
		}
	// Public Method
	public void myPublicMethod(){
		
		System.out.println("Public Method Must calls By creating Object");
	}
	  
	// Main Method
	public static void main(String[] args) {
		
		MyClass.myStaticMethod();  
		//OR
		myStaticMethod();
		
		MyClass mc=new MyClass();
		mc.myPublicMethod();
	}

}
