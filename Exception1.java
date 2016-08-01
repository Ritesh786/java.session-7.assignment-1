package com.Ritesh.tools;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
	 int arr[]=new int[5];  
	 int i,no;
	 Scanner s = new Scanner(System.in);
	 System.out.println("size of Array is 5");
	 System.out.println("Enter the element of Array");
	 for(i=0;i<5;i++){
		 arr[i]=s.nextInt();
		 } 
	 try{
	 System.out.println("Enter array number that u want to display");
	  no=s.nextInt();
	 System.out.println("Array number that u want to show = "+arr[no-1]);}
	
		   catch( ArrayIndexOutOfBoundsException e){
				 System.out.println("u want to display that array number which is out of bound");
		   }
	 s.close();
	 }
  
}
