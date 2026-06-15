import java.util.Scanner;
public class Exercise0504_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("年を入力してください");
		int year = scan.nextInt();
		System.out.println("月を入力してください");
		int month = scan.nextInt();
		
		boolean uruu = false;			//うるう年であればtrue,うるう年でなければfalseになる.
		if(year % 400 == 0)
		{
			uruu = true;
		}else if(year % 4 == 0 && year % 100 != 0) 
		{
			uruu = true;
		}
		int day = 1;					//その月の日数を求める.
		System.out.println("SUM MON TUE WED THU FRI SAT");
		if(uruu == true) 
		{
			switch(month) 
			{
				case 2: day=29;break;
				case 4:
				case 6:
				case 9:
				case 11: day=30;break;
				default: day=31;
			}
		}else if(uruu == false)
		{
			switch(month) 
			{
				case 2: day=28;break;
				case 4:
				case 6:
				case 9:
				case 11: day=30;break;
				default: day=31;
			}
		}
		int week = 1;
		if(month == 1 || month == 2) 
		{
			year -= 1;
			month += 12;
			week = (((year + (year/4) - (year/100) + (year/400) + ((13 * month + 8)/5) + 1)) % 7);//曜日を求める
		}else 
		{
			week = (((year + (year/4) - (year/100) + (year/400) + ((13 * month + 8)/5) + 1)) % 7);//曜日を求める
		}
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
	}
		
}