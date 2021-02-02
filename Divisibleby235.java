package day1;

public class Divisibleby235 {

	public static void main(String[] args) {
		
		int count =0;
		System.out.println("The first 5 no divisible by 2,3 and 5 are");
		for(int j=1;j<=500;j++)
		{
			if(j % 2==0 && j%3==0 && j % 5==0)
			{
				System.out.println(j);
				count++;
				if(count==5)
				{
					break;
				}
			}
		}
		
		

	}

}
