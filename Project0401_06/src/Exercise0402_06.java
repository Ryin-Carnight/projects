import java.util.Scanner;
public class Exercise0402_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("負の整数か正の整数を入力してください");
		int number = scan.nextInt();
		
		int sum = 0;
		for(;number >= 0;) 
		{
			sum += number;
			System.out.println("負の整数か正の整数を入力してください");
			number = scan.nextInt();
		}
		System.out.println("負の数が入力されるまでの総和は" + sum + "です");
	}
		
}