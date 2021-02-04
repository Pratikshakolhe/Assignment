package day1;

import java.util.Scanner;

public class ArrayProgram {

	public static void main(String[] args) {
		
		int array[]= {10,20,22,45,33};
		System.out.println("Enter num :");
		int num;
		int flag=0;
		Scanner scan=new Scanner(System.in);
		num = scan.nextInt();
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==num)
			{
				System.out.println(i+1);
				flag=1;
			
			}
		}
		
		if(flag==0)
		{
			System.out.println("-1");
		}
		
	

	}

}
