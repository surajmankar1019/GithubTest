package com.tpoint.inheritance;

public class Progarmmer extends Employee {

	int bonus=10000;
	
	float total=salary+bonus;
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		System.out.println(e.salary);
//		System.out.println(e.bonus);  --- Comp Error
		
		Progarmmer p=new Progarmmer();
		System.out.println("Salary is="+p.salary);
		System.out.println("Bonus is="+p.bonus);
		System.out.println("Total Sal IS="+p.total);
	}
}
