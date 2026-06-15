import java.util.Random;
import java.util.Scanner;
public class kadai6_1 {
	public static void main(String[]args) {
		System.out.println("じゃんけんの手を入力してください0=グー、1=チョキ、2=パーです。");
		Scanner scan = new Scanner(System.in);
		int yourhand = scan.nextInt();
		Random hand = new Random();  //乱数生成の準備
		int fist = hand.nextInt(3);//乱数0~2
		if(yourhand == 0) {
			System.out.println("あなたの手はグーです。");
		}else if(yourhand == 1) {
			System.out.println("あなたはの手はチョキです。");
		}else if(yourhand ==2) {
			System.out.println("あなたの手はパーです。");
		};
		if(fist == 0) {
			System.out.println("私の手はグーです。");
		}else if(fist == 1) {
			System.out.println("私の手はチョキです。");
		}else if(fist ==2) {
			System.out.println("私の手はパーです。");
		};
		if(yourhand == fist) {
			System.out.println("あいこです");
			
		}else if(yourhand ==0 && fist == 1) {
			System.out.println("あなたの勝ちです");
		}else if(yourhand ==0 && fist == 2) {
			System.out.println("私の勝ちです");
		}else if(yourhand ==1 && fist == 0) {
			System.out.println("私の勝ちです");
		}else if(yourhand ==1 && fist == 2) {
			System.out.println("あなたの勝ちです");
		}else if(yourhand ==2 && fist == 0) {
			System.out.println("あなたの勝ちです");
		}else if(yourhand ==2 && fist == 1) {
			System.out.println("私の勝ちです");
		};
	}

}
