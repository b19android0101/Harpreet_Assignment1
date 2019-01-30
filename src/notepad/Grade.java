package notepad;
import java.util.Scanner;
class Grade
{
	
	public static void main(String args[])
	{
		int marks;
		System.out.println("Enter marks");
		Scanner in=new Scanner(System.in);
		marks=in.nextInt();
		if(marks>=85)
		{
		System.out.println("Excellent");
		}
		else if(marks>=70 && marks<85)
		{
		System.out.println("very good");
		}
		else if(marks>=50 && marks<70)
		{
		System.out.println("good");
		}
		else if(marks>=40 && marks<50)
		{
		System.out.println("average");
		}
		else
		{
		System.out.println("fail");
		}
	}
	
}