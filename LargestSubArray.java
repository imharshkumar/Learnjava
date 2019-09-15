package trial;

import java.util.Scanner;

public class LargestSubArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length of array");
		
		int a=sc.nextInt();
		int sum=0;
		int[] ary=new int[a];
		int max=Integer.MIN_VALUE;
		
		System.out.println("enter values to array");
		for(int i=0;i<a;i++)
			ary[i]=sc.nextInt();
		System.out.println("array is :");
		for(int i=0;i<a;i++)
			System.out.print(ary[i]+" ");
		
		System.out.println("\nSub arrays are:");
		
		for(int x=0;x<a;x++)
		{
			
		    for(int i=x;i<a;i++)
		    {
		    	sum=0;
			    for(int j=x;j<=i;j++)
			    {
			    	sum=sum+ary[j];
			    	if(sum>max)
			    		max=sum;
			   	    System.out.print(ary[j]+" ");
			    }
			    System.out.print(" : sum is : "+sum+"\n");
		    }
		}
		System.out.println("largest sub array is :"+max);
		
	}

}
