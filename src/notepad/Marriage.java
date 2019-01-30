package notepad;
import java.util.Scanner;
class Marriage
{
	public static void main(String args[])
	{
		int age,f,m;
		String g;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter gender");
		g=in.nextLine();
		System.out.println("Enter age");
		age=in.nextInt();
		if(g.equals("Male") && age>=21)
		{	
		System.out.println("Eligible for marriage");
		}
		if (g.equals("Female") && age>=18)
		{
		System.out.println("not eligible for marriage");
		}
		else
		{
		System.out.println("invalid");
		}
	}
}
