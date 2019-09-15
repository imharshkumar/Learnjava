package trial;

import java.util.Scanner;

public class LargestSubArrayCadezAlgo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length of array");
		
		int a=sc.nextInt();
		int[] ary=new int[a];
		int max=Integer.MIN_VALUE;
	    int currSum=0;
	    
	    System.out.println("enter values to array");
		for(int i=0;i<a;i++)
			ary[i]=sc.nextInt();
		System.out.println("array is :");
		for(int i=0;i<a;i++)
			System.out.print(ary[i]+" ");
	    for(int i=0;i<a;i++)
	    {
	    	currSum+=ary[i];
	    	if(currSum>max)
	    		max=currSum;
	    	if(currSum<0)
	    		currSum=0;
	    	
	    }
	    System.out.println("\nLargest sub array is: "+ max);

	}

}
