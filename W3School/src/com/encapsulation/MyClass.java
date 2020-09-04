package com.encapsulation;

public class MyClass {

	public static void main(String[] args) {
		
		Person p=new Person();
				
//		p.name="Suraj";  Gives Erroor we can not Access Directly
		
		p.setId(1);
		p.setName("Suraj Mankar");
		System.out.println(p.getName());
		System.out.println(p.getId());
	}
}
