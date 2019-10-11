
import java.util.Scanner;

public class Task {
	
	  public static void main(String[] args) {
		
		int num1, num2, count = 0, i, j;  
		  
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		num1 = scanner.nextInt();
		System.out.println("Please enter the second number:");
		num2 = scanner.nextInt();
		
		System.out.println("The result is:");
		int sum = 0;
		for(i = num1; i <= num2; i++)
		{
			for( j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					count = 0;
					break;
				}
				else
				{
					count = 1;
				}
			}
			if(count == 1)
			{
				sum =sum+1;

			}
		}
		System.out.println(sum);
		
	  }
	  }
