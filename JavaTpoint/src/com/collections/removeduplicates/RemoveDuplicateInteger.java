package com.collections.removeduplicates;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicateInteger {
   
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		  al.add(1);
		  al.add(2);
		  al.add(3);
		  al.add(1);
		  al.add(2);
		  al.add(4);
		  al.add(5);
		  al.add(4);
		  
		  System.out.println(al);
		  
		 Set<Integer> s=new LinkedHashSet<>(al);
		 System.out.println(s);
	}
}
