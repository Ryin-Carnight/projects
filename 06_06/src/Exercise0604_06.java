import java.util.Scanner;
public class Exercise0604_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("年を入力してください");
		int year = scan.nextInt();
		int month = 2;
		
		boolean uruu = false;			//うるう年であればtrue,うるう年でなければfalseになる.
		if(year % 400 == 0)
		{
			uruu = true;
		}else if(year % 4 == 0 && year % 100 != 0) 
		{
			uruu = true;
		}
		int day = 1;					//その月の日数を求める.
		if(uruu == true) 
		{
			day = 29;
		}else if(uruu == false)
		{
			day = 28;
		}
		int week = 1;
			year -= 1;
			week = (((year + (year/4) - (year/100) + (year/400) + 39)) % 7);//曜日を求める
		
		int heizitu = 1;
		switch(week)
		{
			case 0: heizitu = 2;break;
			case 6: heizitu = 3;break;
		}
		System.out.println(year + "年2月の最初の平日は2月" + heizitu + "日です");
		
		System.out.println("2月");
		System.out.println("SUM MON TUE WED THU FRI SAT");
		int i = 1;
		for(i = 1;i <= week;i++) 
		{
			System.out.print("    ");
		}
		for(int f = 1;f <= day;f++) 
		{
			if(f <= 9) 
			{
				System.out.print("  " + f + " ");
			}else if(f >= 10) 
			{
				System.out.print(" " + f + " ");
			}
			if(i % 7 == 0)System.out.println("");
			i++;
		}
		System.out.println();
		
		week = (week + day)%7;
		System.out.println("3月");
		System.out.println("SUM MON TUE WED THU FRI SAT");
		i = 1;
		for(i = 1;i <= week;i++) 
		{
			System.out.print("    ");
		}
		for(int f = 1;f <= 18;f++) 
		{
			if(f <= 9) 
			{
				System.out.print("  " + f + " ");
			}else if(f >= 10) 
			{
				System.out.print(" " + f + " ");
			}
			if(i % 7 == 0)System.out.println("");
			i++;
		}
	}
		
}