package com.abstractdemo;

public class Student extends Person 
{
	public int graduationyear =2017;

	
	@Override
	public void study() {
		
		System.out.println("Student Studying All Long Day");
	}

	public static void main(String[] args) {
		
		System.out.println("College Name:-"+Student.college);
		Student s=new Student();
		System.out.println("Name:-"+s.fname);
		
		System.out.println("Age:-"+s.age);
		System.out.println("Graduation Year:-"+s.graduationyear);
		System.out.println("--------------------");
		s.study();  // Call Abstract Method
		
		
	}
}
