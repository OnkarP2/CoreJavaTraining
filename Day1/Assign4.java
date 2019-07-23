package com.ct;
import java.util.Scanner;
public class Assign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int n1=sc.nextInt();
		System.out.println("Enter 2nd number");
		int n2=sc.nextInt();
		int res=0;
		
		for(int i=0;i<n2;i++)
		{
			res=res+n1;
		}
	
		System.out.println(res);
		
	}

}
