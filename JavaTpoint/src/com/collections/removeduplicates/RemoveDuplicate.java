package com.collections.removeduplicates;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Avi");
		al.add("Suraj");
		al.add("Avi");
		al.add("Ketan");
		al.add("Suraj");
		System.out.println(al.toString());
		
		Set<String> s=new LinkedHashSet<>(al);
		 System.out.println(s);
	}
	
}
