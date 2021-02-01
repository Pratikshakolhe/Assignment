package day1;

import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number to check whether it is prime or not :");
		int num=scan.nextInt();
		boolean flag=false;
		for(int i=2;i<=num/2;++i)
		{
			if(num % i == 0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println(num +" is a Prime number.");
		else 
		   System.out.println(num +" is not a  Prime number");
		
		

	}

}
