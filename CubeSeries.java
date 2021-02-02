package day1;

import java.util.Scanner;

public class CubeSeries {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number :");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			int cube;
			cube=i*i*i;
			System.out.print(cube);
			System.out.print("\t");
			
		}
		

	}

}
