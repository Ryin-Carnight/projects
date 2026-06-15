import java.util.Scanner;
public class kadai1_06
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("ピラミッドの高さを入力してください");
		int floor = scan.nextInt();
		for(int p = 1;p <= floor;p++) 
		{
			int ast = 2*floor - 1;
			int air = p - 1;
			for(int a = 1;a <= air;a++) 
			{
				System.out.print(" ");
			}
			ast = ast - (air * 2);
			for(int y = 1;y <= ast;y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}