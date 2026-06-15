import java.util.Scanner;
public class Exercise0401_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("月を入力してください");
		int month = scan.nextInt();
		for(;month < 1 ||month > 12;) 
		{
			System.out.println("1～12月以外の数字を入力しないで下さい");
			System.out.println("もう一度月を入力してください");
			month = scan.nextInt();
		}
		int day = 31;
		switch(month) 
		{
			case 2: day = 28;break;
			case 3: day = 31;break;
			case 4: day = 30;break;
			case 5: day = 31;break;
			case 6: day = 30;break;
			case 7: day = 31;break;
			case 8: day = 31;break;
			case 9: day = 30;break;
			case 10: day = 31;break;
			case 11: day = 30;break;
			case 12: day = 31;break;
		}
		System.out.println(month + "月の日数は" + day + "日です");
	}
		
}