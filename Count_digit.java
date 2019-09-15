package trial;

import java.util.Scanner;

public class Count_digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.");
		int a=sc.nextInt();
		
	
		int x= (int)Math.log10(a)+1;
		
		System.out.println("no. of digit is = "+x);

	}

}
