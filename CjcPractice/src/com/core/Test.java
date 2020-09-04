package com.core;

public class Test {

	public Student m1()
	{
		Student s=new Student();
		s.setRollno(1);
		s.setName("Suraj");
		s.setAddr("Pune");
		return s;
	}
	public static void main(String[] args) {
		
		Test t=new Test();
		
		Student stu=t.m1();
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddr());
		
	}
}
