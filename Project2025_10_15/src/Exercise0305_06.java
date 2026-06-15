import java.util.Scanner;
public class Exercise0305_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("年を入力してください");
		int year = scan.nextInt();
		System.out.println("月を入力してください");
		int month = scan.nextInt();
		System.out.println("日を入力してください");
		int day = scan.nextInt();
		int all_day = day;
		boolean uruu = false;			//うるう年であればtrue,うるう年でなければfalseになる。
		if(year % 400 == 0)
		{
			uruu = true;
		}else if(year % 4 == 0 && year % 100 != 0) 
		{
			uruu = true;
		}
		if(uruu == true) 
		{
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
				case 3: all_day += 29;
				case 2: all_day += 31;
				System.out.println(year + "年" + month + "月" + day + "日はうるう年なので1月1日から" +all_day + "日目です");
			}
		}else if(uruu == false)
		{
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
				System.out.println(year + "年" + month + "月" + day + "日は平年なので1月1日から" +all_day + "日目です");
			}
		}
	}
		
}