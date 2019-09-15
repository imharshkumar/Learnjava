package trial;

import java.util.Scanner;

public class Printno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		int a=sc.nextInt();
		int q=0;
		for(int i=1;i<=a;i++)
		{
			for(int j=a;j>i;j--)
				System.out.print(" ");
			
			for(int k=1;k<=i;k++) {
				q++;
			
				System.out.print(q+" ");}
			
			System.out.println();
		}


	}

}
