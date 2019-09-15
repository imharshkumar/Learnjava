package trial;

import java.util.Scanner;

public class Starprint4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		int a=sc.nextInt();
		for(int i=1;i<=a*2-1;i++)
		{
			if(i<=a)
			{
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			}
			else
			{
				for(int x=i;x<=a*2-1;x++)
					System.out.print("* ");
			}
			System.out.println();
			
		}
			

	}

}
