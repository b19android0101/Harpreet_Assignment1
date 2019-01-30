package notepad;
import java.util.Scanner;
class Gratest
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a");
		a=in.nextInt();
		System.out.println("Enter b");
		b=in.nextInt();
		System.out.println("Enter c");
		c=in.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}
}
