import java.util.Scanner;
public class Exercise0304_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("月を入力してください");
		int month = scan.nextInt();
		System.out.println("日を入力してください");
		int day = scan.nextInt();
		int all_day = day;
		switch(month) 							//1月ならこの{}は素通りしてすでに入ったdayがn日目。大きいものから足していって無駄なくいこう。
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
		System.out.println(month + "月" + day + "日は1月1日から" +all_day + "日目です");
	}
		
}