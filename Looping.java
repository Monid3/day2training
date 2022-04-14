package com.wipro.project;

public class Looping {
	
	public static void main(String args[]) {
		
		for(int i=1;i<=20;i++) {
			System.out.println(i);
	}
	
	int sum=0;
	int mul=1;
	for(int i=1;i<20;i++)
	{
		sum=sum+i;
		mul=mul*i;
	}
		System.out.println("sum" +sum  +  " mul " +mul);
	

}
}
