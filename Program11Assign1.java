package day1;

public class Program11Assign1 {

	private static int i;

	public static void main(String[] args) {
		
		for(i=2; i<18; i++)
		{
			boolean isPrime = true;
			
			for(int j = 3;j<i; j++)
			{
				if(i % j ==0)
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
