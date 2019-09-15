package trial;

import java.util.Scanner;

public class starprint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		int a=sc.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<i;j++)
				System.out.print("  ");
			for(int k=a;k>=i;k--)
				System.out.print("* ");
			System.out.println();
		}
		

	}

}
