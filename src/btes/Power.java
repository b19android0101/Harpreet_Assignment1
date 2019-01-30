package btes;

import java.util.Scanner;

public class Power 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int k=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		System.out.println("Enter power");
		int p=s.nextInt();
		 for(int i=1;i<=p;i++)
		 {
			 k=k*n;
		 }
			 System.out.println("power is="+k);
		 }
	}

