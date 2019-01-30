package btes;

import java.util.Scanner;

public class Length {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x,len=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		x=s.nextInt();
		while(x>0)
		{
			len++;
			x=x/10;
		}
		System.out.println("length of the no.is:"+len);
		
	}

}
