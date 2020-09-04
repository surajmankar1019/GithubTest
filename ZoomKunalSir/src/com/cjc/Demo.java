package com.cjc;

public class Demo {

	int x;
	
	public Demo m1(){
		Demo d=new Demo();
		d.x=50;
		return d;
	}
	public static void main(String[] args) {
		
		Demo d=new Demo();
		Demo d1=d.m1();
		
		System.out.println(d.x);
		System.out.println(d1.x);
	}
}
