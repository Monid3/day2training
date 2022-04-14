package com.wipro.project;

import java.util.Scanner;


public class Sum {
	public static void main(String args[]) 
	{
	
	Scanner scan=new Scanner(System.in);
	int sum=0,r,n;
	
	System.out.println("Enter n:");
	n=scan.nextInt();
	
	while(n>0)
	{
		r=n%10;
		sum=sum+r;
		n=n/10;
	}
	System.out.println("sum is :" +sum);
	

	}
}

