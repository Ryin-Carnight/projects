import java.util.Scanner;
public class Exercise0107_06
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("1つ目の整数を入力してください");
		int number_one = scan.nextInt();
		System.out.println("2つ目の整数を入力してください");
		int number_two = scan.nextInt();
		if(number_one >= number_two) 
		{
			int nokori = number_one - number_two;
			System.out.println("大きい方から小さい方を引いた値は" + nokori + "です");
		}else 
		{
			int nokori = number_two - number_one;
			System.out.println("大きい方から小さい方を引いた値は" + nokori + "です");
		}
	}
}
