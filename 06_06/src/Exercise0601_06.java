import java.util.Scanner;
public class Exercise0601_06 
{
	public static void main(String[] args) 
	{
		float ave = 0;
		int number = 0;
		int all = 0;
		int i = 0;
		for(;number >= 0;i++)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("整数を入力してください");
			number = scan.nextInt();
			if(number < 0) 
			{
				number = 0;
				break;
			}
			all += number;
		}
		if(i > 0) 
		{
			ave = all/i;
		}else ave = 0;
		System.out.println("合計は" + all + "、個数は" + i + "、平均は" + String.format("%.2f", ave) + "です");
	}	
}