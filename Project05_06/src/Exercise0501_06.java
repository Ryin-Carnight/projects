import java.util.Scanner;
public class Exercise0501_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int natural_number = 0;
		int sum = 0;
		for(int i = 1;i <= 5;i++) 
		{
			System.out.println(i + "つ目の非負整数を入力してください");
			natural_number = scan.nextInt();
			if(natural_number < 0) 
			{
				System.out.println("非負整数を入力してください");
				System.out.println("もう一度非負整数を入力してください");
				i--;
			}else 
			{
				sum += natural_number;
			}
		}
		System.out.println("あなたが入力した非負整数5つの和は" + sum + "です");
	}
		
}