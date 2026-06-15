import java.util.Scanner;
public class kadai10_1_2 {
	public static void main(String[]args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("整数を入力してください");
		int a = scan.nextInt();
		
		System.out.println("もう一つ整数を入力してください");
		int b = scan.nextInt();
		
		if(a == b) {
			System.out.println("何もしない");
		}else if (a < b) {
			System.out.println("カウントアップ");
		for(int c;a <= b;a++) {
			c = a;
			System.out.println(c);
		}
		}else if(a >b) {
			System.out.println("カウントダウン");
		for(int c;a >= b;a--) {
			c = a;
			System.out.println(c);
		}
		}
	}
}