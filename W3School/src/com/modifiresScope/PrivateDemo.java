package com.modifiresScope;

public class PrivateDemo 
{
   private String fname="Suraj";
   private String lname="Mankar";
   private String email="surajmanks@gmail.com";
   private String city="pune";
   private int age=30;
   
   public static void main(String[] args) {
		
       PrivateDemo pd=new PrivateDemo();
		
		System.out.println("Name:-"+pd.fname+" "+pd.lname);
		System.out.println("City:-"+pd.city);
		System.out.println("Emailid:-"+pd.email);
		System.out.println("Age:-"+pd.age);
	}
}
