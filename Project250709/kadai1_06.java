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
			int t = 2*(p - 1);
			int f = floor - p;
			for(int a = 1;a <= f;a++) 
			{
				System.out.print(" ");
			}
			for(int y = 0;y <= t;y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}