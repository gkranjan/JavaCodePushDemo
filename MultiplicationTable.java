import java.util.Scanner;
public class MultiplicationTable
{
	public static void main(String[] args)
		{
			System.out.println("Please enter a number those you want to multiply");
			System.out.print("Enter a Multiplication Number:-");
			
				Scanner sc=new Scanner(System.in);
					int a=sc.nextInt();
					
						for (int i=1;i<=10;i++)
						{
							System.out.println(i*a);
						}
			
		
		}
}