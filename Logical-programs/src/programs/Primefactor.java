package programs;

import java.util.Scanner;

public class Primefactor {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=s.nextInt();
		int i;
		for(i=2;i<n;i++)
		{
			while(n%i==0)
			{
				System.out.println(i+"");
				n=n/i;
				
			}
		}
		if(n>2)
		{
			System.out.println(n);
		}	
	}
}
