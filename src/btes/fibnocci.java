package btes;

import java.util.Scanner;

public class fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib,a=0,b=1,i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number");
		int n=in.nextInt();
		System.out.print(a+" "+b+" ");
		for(i=1;i<=n-2;i++)
		{
			fib=a+b;
			System.out.print(fib+" ");
			a=b;
			b=fib;
		
		}
	}

}
