import java.util.Scanner;
public class Exercise0904_11613 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];
		for(int i = 0;i < 5;i++) 
		{
			System.out.println((i + 1) + "番目の数");
			score[i]= scan.nextInt();
		}
		for(int i = 5;i > 0;i--) 
		{
			System.out.println(i + "番目の数");
			System.out.println(score[i-1]);
		}
	}
}