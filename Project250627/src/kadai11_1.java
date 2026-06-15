import java.util.Scanner;
public class kadai11_1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("時刻を入力してください");
		System.out.println("時刻を入力");
		int time = scan.nextInt();
		
		switch(time){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("おやすみなさい");break;
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				System.out.println("おはようございます");break;
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
				System.out.println("こんにちは");break;
			case 17:
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
				System.out.println("こんばんは");break;
		}
		
		
		
	}
}
