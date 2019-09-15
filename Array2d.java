package trial;

import java.util.Scanner;

public class Array2d {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter matrix dimension");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int [][] mat1=new int [r][c];
		int [][] mat2=new int [r][c];
		int [][] mat3=new int [r][c];
		
		System.out.println("enter element of 1st matrix");
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter matrix 2");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat3[i][j]=mat1[i][j] + mat2[i][j];
			}
		}
		
		System.out.println("sum is= ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(mat3[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
