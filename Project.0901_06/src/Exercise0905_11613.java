import java.util.Scanner;
public class Exercise0905_11613 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("要素数を記入してください");
		int n = scan.nextInt();
		int[] score = new int[n];
		for(int i = 0;i < n;i++) 
		{
			score[i]= 2*i+1;
		}
		for(int i = 0;i < score.length;i++) 
		{
			System.out.println();
			System.out.println((i + 1) + "番目の数");
			System.out.println(score[i]);
		}
	}
}