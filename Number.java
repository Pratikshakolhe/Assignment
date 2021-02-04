package day1;

import java.util.*;

public class Number {

	public static void main(String[] args) {
		
		int a[]= {50,11,8,56,34,23,45,80,99,21};
		
		System.out.println("Array" +Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("sorted array="+Arrays.toString(a));
		System.out.println("smallest element ="+a[0]);
		System.out.println("second smallest element="+a[1]);
		
		System.out.println("largest element ="+a[9]);
		
		System.out.println("secondlargest element ="+a[8]);
		
		

	}

}
