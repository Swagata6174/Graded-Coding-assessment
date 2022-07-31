package com.greatlearning.main;
import java.util.*;

public class Building {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the toal no of floors in the building:");
		int n=sc.nextInt();
		int x[]=new int[n+1];
		for(int i=1;i<n+1;i++)
		{
			System.out.println("Enter te floor size given on the day:" +i);
			int m=sc.nextInt();
			x[m]=i;
		}
		Construction construction=new Construction();
		construction.floorConstruction(n,x);
		
	                                     }
	

}
