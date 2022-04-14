package com.wipro.project;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String args[]) 
	{
	
	Scanner scan=new Scanner(System.in);
	int rev=0,r,n,temp;
	
	System.out.println("Enter n:");
	n=scan.nextInt();
	temp=n;
	
	while(n>0)
	{
	    r=n%10;
		rev=rev*10+r;
		n=n/10;

	}
	n=temp;
	if(n==rev)
		System.out.println("Palindrome");
	else 
		System.out.println("Not An Palindrome ");
	}
	


}
