package btes;

import java.util.Scanner;

public class Primeornot 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		boolean flag=true;
		System.out.println("Enter number");
		 n=in.nextInt();
		for(int i=2;i<n;i++)
		
			if(n%i==0)
			{
				flag=false;
				break;
			}
	
			if(flag==false)
			{
				System.out.println("not prime");
			}
			else
			{
				System.out.println("prime");
			}
		}
}


