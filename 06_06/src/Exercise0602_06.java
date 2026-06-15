import java.util.Scanner;
public class Exercise0602_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("年を入力してください");
		int year = scan.nextInt();
		System.out.println("月を入力してください");
		int month = scan.nextInt();
		System.out.println("日	を入力してください");
		int day = scan.nextInt();
		
		int tulera = 12;
		int week = 1;
		if(month == 1 || month == 2) 
		{
			year -= 1;
			tulera += month;
			week = (((year + (year/4) - (year/100) + (year/400) + ((13 * tulera + 8)/5) + day)) % 7);//曜日を求める
		}else 
		{
			week = (((year + (year/4) - (year/100) + (year/400) + ((13 * month + 8)/5) + day)) % 7);//曜日を求める
		}
		
			switch(week) 
			{
				case 0: System.out.println("その日の曜日は日曜日です");break;
				case 1: System.out.println("その日の曜日は月曜日です");break;
				case 2: System.out.println("その日の曜日は火曜日です");break;
				case 3: System.out.println("その日の曜日は水曜日です");break;
				case 4: System.out.println("その日の曜日は木曜日です");break;
				case 5: System.out.println("その日の曜日は金曜日です");break;
				case 6: System.out.println("その日の曜日は土曜日です");break;
			}
		
		
	}
		
}