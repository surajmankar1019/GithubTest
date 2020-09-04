package com.demo.perennial;

public class RotateLeft {

	 public static void main(String[] args) {  
	        
	        int [] arr = new int [] {42,24,71,19};     
	        int n = 2;  
	           
	        System.out.println("Given array is:- ");  
	        for (int i = 0; i < arr.length; i++) {   
	            System.out.print(arr[i] + " ");   
	        }    
	            
	        for(int i = 0; i < n; i++){  
	            int j, first;  
	            first = arr[0];  
	          
	            for(j = 0; j < arr.length-1; j++){  
	                arr[j] = arr[j+1];  
	            }  
	            arr[j] = first;  
	        }    
	        System.out.println();
	        System.out.println("Array after left rotation: ");  
	        for(int i = 0; i< arr.length; i++){  
	            System.out.print(arr[i] + " ");  
	        }  
	    }  
}
