package trial;

import java.util.Scanner;

public class Starprint5 {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		int a=sc.nextInt();
		
		System.out.print("*");
		System.out.println();
		
		for(int i=1;i<a-1;i++)
		{
			System.out.print("* ");
			for(int j=1;j<i;j++)
				System.out.print("  ");
			System.out.print("*");
			System.out.println();
		}
		for(int z=1;z<=a;z++)
		{
			System.out.print("* ");
		}
		
	}

}
