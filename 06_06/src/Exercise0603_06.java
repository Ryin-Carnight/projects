import java.util.Scanner;
public class Exercise0603_06 
{
	public static void main(String[] args) 
	{
			Scanner scan = new Scanner(System.in);
			System.out.println("時刻24時間表記でを入力してください");
			int hour = scan.nextInt();
			System.out.println("分を入力してください");
			int min = scan.nextInt();
			int hour_fif = hour;
			int min_fif = min + 50;
			if(min_fif >= 60) 
			{
				min_fif = min_fif%60;
				hour_fif += 1;
			}
				hour_fif = hour_fif%24;
			System.out.println(hour + "時" + min + "分" + "の50分後の時刻は" + hour_fif  + "時" + min_fif + "分です");
			System.out.println(hour + "時" + min + "分" + "の10分前の時刻は" + ((hour_fif+23)%24)  + "時" + min_fif + "分です");
	}	
}