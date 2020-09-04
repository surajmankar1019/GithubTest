package com.modifiresScope.forpublic;

//import com.modifiresScope.DefaultDemo;
import com.modifiresScope.Person;
import com.modifiresScope.ProtectedDemo;

public class Test {

//	This is Testing For Access Modifiers in other Packages weather it is accissible or not
	
	public static void main(String[] args) {
	
//		-------- For Private --------
	    Person p=new Person();
     
        System.out.println("Name:-"+p.fname+" "+p.lname);
		System.out.println("City:-"+p.city);
		System.out.println("Emailid:-"+p.email);
		System.out.println("Age:-"+p.age);
		
		System.out.println("----------------------------------");
		
    /*    DefaultDemo dd=new DefaultDemo();  --Gives Error Defaul Modifiers is not Accissible in Other Packages
		
		System.out.println("Name:-"+dd.fname+" "+p.lname);
		System.out.println("City:-"+dd.city);
		System.out.println("Emailid:-"+dd.email);
		System.out.println("Age:-"+dd.age);*/
		
//	  --------	for Protected -------------
		
//		Not Accissible in Other Packages
		
		/*ProtectedDemo pd=new ProtectedDemo();
		
		System.out.println("Name:-"+pd.fname+" "+p.lname);
		System.out.println("City:-"+pd.city);
		System.out.println("Emailid:-"+pd.email);
		System.out.println("Age:-"+pd.age);  */
		
	      
   }
}


