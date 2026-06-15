import java.util.Scanner;
public class Exercise0701_06 
{
	public static void main(String[] arges) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("時刻を24時間表記で入力してください");
		int hour = scan.nextInt();
		System.out.println("分を入力してください");
		int min = scan.nextInt();
		System.out.println("整数を-2000～2000の範囲で入力してください");
		int nhun = scan.nextInt();
		int hour_later = hour;
		int min_later = min + nhun;
		
		hour_later += (min_later/60)%24;
		min_later = min_later % 60;
		if(hour_later < 0) 
		{
			hour_later += 24;
		}
		if(min_later < 0) 
		{
			min_later += 60;
		}
		System.out.println(hour + "時" + min + "分の" + nhun + "分後は" + hour_later + "時" + min_later + "分です");
	}
}
