package com.inheritance.type;

public class Test {

	public static void main(String[] args) {
		
		Father f=new Father();
		f.property();  // Fathers Property
		f.marriage(); // Marry His Son Subhalakshmi
		System.out.println(f.a); // 10
		System.out.println(f.x); // 20
		
		System.out.println("----------------");
		
		Father f1=new Son();
		f1.property();   // Son is a Nominy O f Parent Property 
		f1.marriage();  // not Satisfied fathers Selection Son Selected Laxmi
		System.out.println(f1.a); // 10
		System.out.println(f1.x); // 20
	}
}
