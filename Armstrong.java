package com.wipro.project;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String args[]) 
	{
	
	Scanner scan=new Scanner(System.in);
	int n,c,sum=0,temp,r;
	
	System.out.println("Enter n:");
	n=scan.nextInt();
	
	temp=n;
	
	while(n>0)
	{
	    r=n%10;
	    c=r*r*r;
		sum=sum+c;
		n=n/10;
	}
	n=temp;
	if(n==sum)
		System.out.println("Armstrong number");
	else 
		System.out.println("Not An Armstrong number");
	}
		
}
