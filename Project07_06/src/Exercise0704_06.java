import java.util.Scanner;
public class Exercise0704_06 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("月を入力してください");
		int month = scan.nextInt();
		System.out.println("日を入力してください");
		int day = scan.nextInt();
		System.out.println("２つ目の月を入力してください");
		int two_month = scan.nextInt();
		System.out.println("２つ目の日を入力してください");
		int two_day = scan.nextInt();
		int all_day = day-1;
		switch(month)
		{
			case 12: all_day += 30;
			case 11: all_day += 31;
			case 10: all_day += 30;
			case 9: all_day += 31;
			case 8: all_day += 31;
			case 7: all_day += 30;
			case 6: all_day += 31;
			case 5: all_day += 30;
			case 4: all_day += 31;
			case 3: all_day += 28;
			case 2: all_day += 31;
		}
		int all_two_day = two_day;
		switch(two_month) 
		{
			case 12: all_two_day += 30;
			case 11: all_two_day += 31;
			case 10: all_two_day += 30;
			case 9: all_two_day += 31;
			case 8: all_two_day += 31;
			case 7: all_two_day += 30;
			case 6: all_two_day += 31;
			case 5: all_two_day += 30;
			case 4: all_two_day += 31;
			case 3: all_two_day += 28;
			case 2: all_two_day += 31;
		}
		int minus = (all_two_day - all_day);
		if(minus <= 0)minus += 365;
		System.out.println("1組目の月日から数えて２つ目の月日は" + minus + "日目です");
	}
		
}