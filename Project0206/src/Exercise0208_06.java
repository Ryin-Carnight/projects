import java.util.Scanner;
public class Exercise0208_06 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		System.out.println("月を入力してください");
		int month = stdIn.nextInt();
		System.out.println("日を入力してください");
		int day = stdIn.nextInt();
		int all_day = day;
		for(int p = 1;p < month;p++)
		{
			if(p == 2) 
			{
				all_day += 28;
			}else if(p == 4 || p == 6 || p == 9 || p == 11) 
			{
				all_day += 30;
			}else 
			{
				all_day += 31;
			}
		}
		System.out.println(month + "月" + day + "日は1月1日から" + all_day + "日目です。");
	}
}