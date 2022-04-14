package com.wipro.project;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String args[]) 
	{
	
	Scanner scan=new Scanner(System.in);
	int a=0,b=1,c,i,n;
	
	System.out.println("Enter limit:");
	n=scan.nextInt();
	
	for(i=1;i<=n;i++) {
		
		
		System.out.println(a);
		c=a+b;
		a=b;
		b=c;
	}


}
}
