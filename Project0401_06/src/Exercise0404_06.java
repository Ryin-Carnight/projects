import java.util.Scanner;
public class Exercise0404_06 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("2以上の整数を入力してください");
		int number = scan.nextInt();
		int division_number = number;
		int division = 0;
		int count = 1;
		for(;division_number != 1;) 
		{		
			for(int p = 2;p <= division_number;p++) 
			{
				if(division_number % p == 0) 
				{
					int f = 0;
					division = p;
					count = 1;
					for(f = 0;division_number % p == 0;f++) 
					{
						division_number /= p;
						count *= p;
					}
					if(f >= 2) 
					{
						if(number/count == 1) 
						{
							System.out.print(division + "^" + f);
						}else 
						{
							System.out.print("(" + division + "^" + f + ")");
						}
					}else 
					{
						System.out.print(division);
					}
					if(division_number != 1) 
					{
						System.out.print("*");
					}
				}
			}
		}
	}
		
}