import java.util.Random;
import java.util.Scanner;
public class Exercise1302_11613
{
	static int[] cent(int natural_number) 
	{
		Random rand = new Random();
		int[] hihu = new int[natural_number];
		for(int i = 0;i < natural_number;i++) 
		{
			hihu[i] = i;
		}
		for(int i = hihu.length-1;i > 0;i--)
		{
			int shuffle = rand.nextInt(i + 1);
			int buffer = hihu[i];
			hihu[i] = hihu[shuffle];
            hihu[shuffle] = buffer;
		}
		return hihu;
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("整数を入力してください");
		int number = scan.nextInt();
		int[] shuffle = new int[number];
		shuffle = cent(number);
		for(int i = 0;i < shuffle.length-1;i++) 
		{
			System.out.print(shuffle[i] + "、");
		}
		System.out.print(shuffle[shuffle.length-1]);
	}
}