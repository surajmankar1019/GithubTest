package com.returntypeclassname;

public class Test {

	public Student m1(){
		Student s=new Student();
		s.setRollno(1);
		s.setName("Suraj");
		s.setAddr("Pune");
		return s;
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
		
		Student s1=t.m1();
		
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
		System.out.println(s1.getAddr());
	}
}
