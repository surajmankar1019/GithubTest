package com.multithreading;

public class Test {

	public static void main(String[] args) {
		
		Hello h=new Hello();
		
		MyThread t1=new MyThread("Java", h);
		MyThread t2=new MyThread("Classes", h);
		
		t1.start();
		t2.start();
	}
}
