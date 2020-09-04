package com.returntypes;

public class B {

	public void m1(){
		System.out.println("M1--A");
	}
	public void m2(int x){
		System.out.println(x);
	}
	public void m3(int i,String s){
		System.out.println(i);
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		B b =new B();
		b.m1();
		b.m2(10);
		b.m3(30, "Avi");
		
	}
}
