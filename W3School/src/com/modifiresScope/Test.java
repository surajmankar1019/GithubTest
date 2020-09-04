package com.modifiresScope;

public class Test {

	public static void main(String[] args) {
		
		
		Person p=new Person();
		System.out.println("Name:-"+p.fname+" "+p.lname);
		System.out.println("City:-"+p.city);
		System.out.println("Emailid:-"+p.email);
		System.out.println("Age:-"+p.age);
		
		System.out.println("----------------------------------");
		
//		--------  For Private Demo --------
		
//		PrivateDemo pd=new PrivateDemo();
		
		/*System.out.println("Name:-"+pd.fname+" "+pd.lname);
		System.out.println("City:-"+pd.city);
		System.out.println("Emailid:-"+pd.email);
		System.out.println("Age:-"+pd.age);*/
		
//		-------- For Default Modifier Demo ---------
		
		DefaultDemo dd=new DefaultDemo();
		
		System.out.println("Name:-"+dd.fname+" "+p.lname);
		System.out.println("City:-"+dd.city);
		System.out.println("Emailid:-"+dd.email);
		System.out.println("Age:-"+dd.age);
	
		System.out.println("------------------------------------");
	
//	-------- For Default Modifier Demo ---------
	
	ProtectedDemo pd=new ProtectedDemo();
	
	System.out.println();
	System.out.println("---- For Protected Modifier ------");
	System.out.println();
	System.out.println("Name:-"+pd.fname+" "+p.lname);
	System.out.println("City:-"+pd.city);
	System.out.println("Emailid:-"+pd.email);
	System.out.println("Age:-"+pd.age);
	
      }
}
