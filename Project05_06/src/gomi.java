import java.util.Scanner;
public class gomi {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("月を入力してください");
		int month = scan.nextInt();
		int gomi = month + 1;
		System.out.println(gomi);
		gomi = month + 2;
		System.out.println(gomi);
		gomi = month + 4;
		System.out.println(gomi);
		gomi = month + 8;
		System.out.println(gomi);
		gomi = month + 16;
		System.out.println(gomi);
		gomi = month + 32;
		System.out.println(gomi);
//		gomi = month + -1;
//		System.out.println(gomi);
//		gomi = month + -2;
//		System.out.println(gomi);
//		gomi = month + -4;
//		System.out.println(gomi);
//		gomi = month + -8;
//		System.out.println(gomi);
//		gomi = month + -16;
//		System.out.println(gomi);
//		gomi = month + -32;
//		System.out.println(gomi);
	}
		
}