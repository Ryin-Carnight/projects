import java.util.Scanner;
public class Exercise0502_06 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("2以上9以下の整数nを入力してください");
		System.out.print("n=");
		int single_number = scan.nextInt();
		int ego = single_number-1;
		int loop = 1;
		for(System.out.print("□| ");loop <= single_number;loop++)
		{
			System.out.print(loop-1 + " ");
		}
		loop = 1;
		System.out.println("");
		for(System.out.print("--+");loop <= single_number;loop++)
		{
			System.out.print("--");
		}
		loop = 1;
		System.out.println("-");
		Loop:
		for(;loop <= single_number;loop++)
		{
			int line = loop-1;
			System.out.print(line + " | ");
			for(int i = 0;i <= ego ;i++) 
			{
				int a = (loop + i-1)%single_number;
				System.out.print(a + " ");
				if(i > ego) 
				{
					break Loop;
				}
			}
			System.out.println("");
		}
	}
		
}