import java.util.Scanner;
public class kadai11_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("時刻を入力してください");
		
		int time = scan.nextInt();
		
		if(time <= 5){
			System.out.println("おやすみなさい");
		}else if(time <= 10){
			System.out.println("おはようございます");
		}else if(time <= 16) {
			System.out.println("こんにちは");
		}else if(time <= 24){
			System.out.println("こんばんは");
		}
	}
		
}
