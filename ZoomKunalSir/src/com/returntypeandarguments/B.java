package com.returntypeandarguments;

public class B extends A
{

	public void m3(String s,int x){
		System.out.println(s);
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		A a=new A();
//		a.m3("Sujit",50); Compiler Error
		a.m3(60, "Sujit");
		
	}
}
