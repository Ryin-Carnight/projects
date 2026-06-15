import java.util.Scanner;
public class kadai4_06
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);

		for(int p = 1;p <= 5;p++) 
		{
			
			if(p % 2 == 1)
			{
				for(int a = 1;a <= 5;a++) 
				{
					if(a % 2 == 1) 
					{
						System.out.print(a);
					}else if(a % 2 == 0) 
					{
						System.out.print("*");
					}
				}
			}else if(p % 2 == 0)
			{
				for(int f = 1;f <= 5;f++) 
				{
					if(f % 2 == 0) 
					{
						System.out.print(f - 1);
					}else if(f % 2 == 1) 
					{
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}