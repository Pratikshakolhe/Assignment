package day1;

import java.util.Scanner;

public class ColorCode {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Color :");
		String code=s.nextLine();
		
		if(code.equalsIgnoreCase("R"))
		{
			System.out.println("Color is Red :");
		}
		else if(code.equalsIgnoreCase("B"))
		{
			System.out.println("Color is Blue :");
		}
		else if(code.equalsIgnoreCase("Y"))
		{
			System.out.println("Color is Yellow :");
		}
		else if(code.equalsIgnoreCase("G"))
		{
			System.out.println("Color is Green :");
		}
		else if(code.equalsIgnoreCase("O"))
		{
			System.out.println("Color is Orange :");
		}
		else if(code.equalsIgnoreCase("W"))
		{
			System.out.println("Color is White :");
		}
		else 
		{
			System.out.println("Invalid Color:");
		}
		
		
		
		
		
		
	
		
		

	}

}
