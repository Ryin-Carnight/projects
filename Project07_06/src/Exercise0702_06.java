import java.util.Scanner;
public class Exercise0702_06 
{
	public static void main(String[] arges) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("整数nを1～999の範囲で入力してください");
		int number_n = scan.nextInt();
		int n_days = number_n;
		int month = 1;
		for(;;) 
		{
			if(month == 2 && n_days > 28) 
			{
				month += 1;
				n_days -= 28;
			}
			if((month == 4 || month == 6 || month == 9 || month == 11) && n_days > 30) 
			{
				month += 1;
				n_days -= 30;
			}
			if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && n_days > 31) 
			{
				month += 1;
				n_days -= 31;
				if(month > 12)month %= 12;
			}
			if(month == 2 && n_days <= 28) 
			{
				break;
			}
			if((month == 4 || month == 6 || month == 9 || month == 11) && n_days <= 30) 
			{
				break;
			}
			if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && n_days <= 31) 
			{
				break;
			}
		}
		System.out.println("1月1日から" + number_n + "日目は" + month + "月" + n_days + "日です");
	}
}
