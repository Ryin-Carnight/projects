import java.util.Random;
import java.util.Scanner;
public class Exercise1203_11613 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("正の整数を記入してください");
		int natural_number = scan.nextInt();
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
		for(int i = 0;i < hihu.length-1;i++) 
		{
			System.out.print(hihu[i] + "、");
		}
		System.out.print(hihu[hihu.length-1]);
	}
}