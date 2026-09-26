import java.util.Scanner;

public class EnterMarks
{
	public static void main(String[] args)
	{
		System.out.println("Please enter your marks");
			
			Scanner sc = new Scanner(System.in);
			int marks = sc.nextInt();
				
					if(marks>=30)
					{
						System.out.println("Pass");
					}
						else
						{
							System.out.println("Fail");
						}
	}
}
