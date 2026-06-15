import java.util.Scanner;
public class kadai25050703 {
	public static void main(String[]arge) {
		Scanner scan = new Scanner(System.in);
		System.out.println("上底を入力してください");
		int jotei = scan.nextInt();
		System.out.println("下底を入力してください");
		int katei = scan.nextInt();
		System.out.println("高さを入力してください");
		int height = scan.nextInt();
		double area = ((jotei+katei)*height/2.0);
		System.out.println(area);
	}
}
