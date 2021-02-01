package day1;

import java.util.Scanner;

public class ReversenouserInput {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
		int number=s.nextInt();
		
		int reverse=0;
		int remainder=0;
		
		
		while(number>=1)  //while(number!=0)
		{
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
		System.out.println("reverse number is " + reverse);
	

	}

}
