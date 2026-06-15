import java.util.Scanner;
public class nisinnsuu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("数字を入力してください");
		int one = scan.nextInt();
		int twe = scan.nextInt();
		int three = scan.nextInt();
		int four = scan.nextInt();
		int nisinsuu = 0;
		nisinsuu += one * 8;
		nisinsuu += twe * 4;
		nisinsuu += three * 2;
		nisinsuu += four * 1;
		System.out.println(nisinsuu);
	}
		
}