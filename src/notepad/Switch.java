package notepad;
import java.util.Scanner;
class Switch
{
	
	public static void main(String args[])
	{
		int marks;
		System.out.println("Enter marks");
		Scanner in=new Scanner(System.in);
		marks=in.nextInt();
		int m=marks/10;
		switch(m){
		
			case 10:
			case 9:
			case 8:
			System.out.println("Excellent");
			break;
			
			
			case 7:
			System.out.println("Very good");
			break;
			
			case 6:
			case 5:
			System.out.println("Good");
			break;
			
			
			case 4:
			System.out.println("Average");
			break;
			
			default:
			System.out.println("Not Qualified");
			
		}
		
	}
}