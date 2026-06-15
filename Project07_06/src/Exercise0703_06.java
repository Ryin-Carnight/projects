import java.util.Scanner;
public class Exercise0703_06 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("月を入力してください");
		int month = scan.nextInt();
		System.out.println("日を入力してください");
		int day = scan.nextInt();
		int one_week = day + 7;
		if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && one_week > 31) 
		{
			month += 1;
			one_week -= 31;
			if(month > 12)month -= 12;
		}else if((month == 4 || month == 6 || month == 9 || month == 11) && one_week > 30) 
		{
			month += 1;
			one_week -= 30;
		}else if(month == 2 && one_week > 28) 
		{
			month += 1;
			one_week -= 28;
		}
		System.out.println("1週間後の日にちは" + month + "月" + one_week + "日です");
	}
		
}