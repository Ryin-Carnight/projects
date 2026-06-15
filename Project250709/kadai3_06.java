import java.util.Scanner;
public class kadai3_06
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("四角形の辺の長さを入力してください");
		
		int ippen = scan.nextInt();
		int air = ippen - 2;
		
		for(int p = 1;p <= ippen;p++) 
		{
			if(p == 1 || p == ippen) 
			{
				for(int e = 1;e <= ippen;e++)
				{
					System.out.print("*");
				}
				System.out.println();
			}else
			{
				System.out.print("*");
				for(int a = 1;a <= air;a++)
				{
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
	}
}