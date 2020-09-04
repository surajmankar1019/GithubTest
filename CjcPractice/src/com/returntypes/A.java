package com.returntypes;

public class A {

	public void m1(int x){
		
		System.out.println("------ Passing Single Parameters ------");
		System.out.println("M1--A");
		System.out.println(x);
		
		System.out.println();
		
	}
	
	public void m2(int x,int y){
		System.out.println("------ Passing Two Parameters Sum ------");
		System.out.println("M2--A");
		int z=x+y;
		System.out.println(z);
	}
	public int m3(int j){
		
		System.out.println("------ Method Return Type------");
		System.out.println("M3--A");
		System.out.println(j);
		return j;
	}
	public int m4(int i){
		
		System.out.println("------ Method Return Type with Sending Values------");
		System.out.println("M4--A");
		System.out.println(i);
		int i1=60;
		System.out.println(i1);
		return i1;
	}
	 public static void main(String[] args) {
		
		 A a=new A();
		 a.m1(10);
		 a.m2(10,20);
		 a.m3(40);
		 a.m4(70);
		 
	}
	 
}
