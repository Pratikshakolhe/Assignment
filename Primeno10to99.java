package day1;

public class Primeno10to99 {

	public static void main(String[] args) {
		
		for(int i=10;i<=99;i++)
		{
			boolean isPrime = true;
			
			for(int j=2; j<i;j++)
			{
				if(i %j==0)
				{
					isPrime = false;
					break;
					
				}
			}
			
			if(isPrime)
				System.out.print(i + " ");
			
		}
		

	}

}
