import java.util.Scanner;
public class Exercise0108_06
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("1つ目の整数を入力してください");
		int number_one = scan.nextInt();
		System.out.println("2つ目の整数を入力してください");
		int number_two = scan.nextInt();
		System.out.println("3つ目の整数を入力してください");
		int number_three = scan.nextInt();
		if(number_two >= number_three) 
		{
			int prus = number_one + number_two;
			System.out.println("結果は" + prus + "です");
		}else 
		{
			int prus = number_one + number_three;
			System.out.println("結果は" + prus + "です");
		}
	}
}
