package com.returntypeandarguments;

public class A {

	public void m1(){
		System.out.println("M1--A");
	}
	
	public void m2(int i){
		System.out.println(i);
	}
   public void m3(int x,String s){
		
	   System.out.println(x);
	   System.out.println(s);
	}
	public static void main(String[] args) {
		
		A a=new A();
		a.m1();
//		System.out.println(a.m1()); // Compiler Error
		a.m2(10);
		a.m3(20, "Suraj");

//		a.m3("Suraj", 40); Complier Error
		
  }
	
}
