import java.util.Scanner;
public class Exercise0503_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("月を入力してください");
		int month = scan.nextInt();
		System.out.println("初日の曜日を入力してください。ただし、日曜～土曜までを順次０～６とする。");
		int week = scan.nextInt();
		
		System.out.println("SUM MON TUE WED THU FRI SAT");
		int i = 1;
		for(i = 1;i <= week;i++) 
		{
			System.out.print("    ");
		}
		int day = 1;
		switch(month) 
		{
			case 2: day=28;break;
			case 4:
			case 6:
			case 9:
			case 11: day=30;break;
			default: day=31;
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