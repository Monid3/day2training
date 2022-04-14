package com.wipro.project;

import java.util.Scanner;

public class Three {
	
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		int n1,n2,n3;
		System.out.println("Enter n1:");
		fact=scan.nextInt();
		System.out.println("Enter n2:");
		n2=scan.nextInt();
		System.out.println("Enter n3:");
		n3=scan.nextInt();
		if(n1>n3 && n1>n2)
			System.out.println(n1+ "is greater");
		else if(n2>n1 && n2>n3)
			System.out.println(n2+ "is greater");
		else
			System.out.println(n3+ "is greater");
			
		
		
		
		
	}

}
