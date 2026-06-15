import java.util.Scanner;
public class kadai10_1_1 {
	public static void main(String[]args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("整数を入力してください");
		int a = scan.nextInt();
		
		System.out.println("もう一つ整数を入力してください");
		int b = scan.nextInt();
		
		if(a > b){
			System.out.println("カウントダウン");
			 while(a >= b) {
			 System.out.println(a--);}
		}else if(a < b) {
			System.out.println("カウントアップ");
			 while(a <= b){
			 System.out.println(a++);}
		}else if(a == b) {
			System.out.println("何も表示しない");
		};
		
	}

}
