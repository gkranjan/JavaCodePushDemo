import java.util.*;

	class AverageArray
	{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt(); 
			int[] a=new int[n];
			long sum=0;
			
				for(int i=0;i<n;i++)
				{
				a[i] = sc.nextInt(); sum+=a[i];}
					
			
					System.out.println("Average=" +(double) sum / n);
		}
	}