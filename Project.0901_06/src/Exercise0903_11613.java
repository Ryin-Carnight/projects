import java.util.Scanner;
public class Exercise0903_11613 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("時刻1:");
		System.out.println("時:");
		int x1 = scan.nextInt();
		System.out.println("分:");
		int y1 = scan.nextInt();
		System.out.println("時刻2:");
		System.out.println("時:");
		int x2 = scan.nextInt();
		System.out.println("分:");
		int y2 = scan.nextInt();
		int x3 = x2-x1;
		int y3 = y2-y1;
		if(x3 < 0)x3 += 24;
		if(y3 < 0)y3 += 60;
		System.out.printf("時刻1は時刻2の%2d 時間%2d分前 \n",x3,y3);
	}	
}