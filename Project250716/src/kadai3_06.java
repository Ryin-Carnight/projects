import java.util.Scanner;
public class kadai3_06
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("西暦年を入力してください");
		int year = scan.nextInt();
		if(year % 400 == 0) 
		{
			System.out.println(year +"年はうるう年です");
		}else if(year % 100 == 0) 
		{
			System.out.println(year +"年は平年です");
		}else if(year % 4 == 0) 
		{
			System.out.println(year +"年はうるう年です");
		}else
		{
			System.out.println(year +"年は平年です");
		}
	}
}