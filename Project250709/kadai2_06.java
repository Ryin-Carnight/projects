import java.util.Scanner;
public class kadai2_06
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		for(int p = 1;p <= 9;p++) 
		{
			for(int a = 1;a <= 9;a++) 
			{
				for(;a <= 9;a++)
				{
					if(p % 3 == 0 || a % 3 == 0) 
					{
						System.out.print(" ");
						break;
					}
					if(p * a < 10) 
					{
						System.out.print("  ");
					}else
					{
						System.out.print(" ");
				}System.out.print(p * a);
				}
			}System.out.println();
		}
	}
}