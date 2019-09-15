package trial;

import java.util.Scanner;

public class LargestsubArray1 {

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
		System.out.println();
		int [] sumar=new int[a];
		sumar[0]=ary[0];
		for(int i=1;i<a;i++)
		{
			sumar[i]=sumar[i-1]+ary[i];
		}
		
		System.out.println("sum array is:\n");
		for(int x=0;x<a;x++)
		{
			
		    for(int i=x;i<a;i++)
		    {
		    	sum=sumar[i]-sumar[x]+ary[x];
			    	if(sum>max)
			    		max=sum;
			    	System.out.print(sum+" ");
		    }
		    System.out.println();
		}
		System.out.println("largest sub array is :"+max);
	}

}
