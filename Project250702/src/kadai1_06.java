import java.util.Scanner;
public class kadai1_06 
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("数字を入力してください");
		int number = scan.nextInt();
		
		for(System.out.println(number);number != 1;) 
		{
		
			if(number % 2 == 0) 
			{
			number = number / 2;
			}else if(number % 2 == 1) 
			{
			number = (number * 3) + 1;
			}
		System.out.println(number);
		}
	}
}
