package com.wipro.project;

import java.util.Scanner;

public class Fact {
 
	public static void main(String args[]) 
	{
		Scanner scan=new Scanner(System.in);
		int fact=1,n,i;
		
		System.out.println("Enter n:");
		n=scan.nextInt();
		

		
		for(i=1;i<=n;i++) 
		{
	
			fact=fact*i;
	    }
		
		System.out.println("factorial of "+n+"is :" +fact);
	}
	

}
