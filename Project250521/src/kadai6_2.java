import java.util.Random;
import java.util.Scanner;
public class kadai6_2 {
		    public static void main(String[] args) {

		        System.out.println("おみくじをふります");
		        System.out.println("願い事をしながら、エンターキーを押してください");
		      	        
		        Scanner stdIn =new Scanner(System.in);
		        String mikuzi =stdIn.nextLine();
		        
		       
			if (mikuzi != "\n") { //　エンターキーが押されたとき
			   Random tenkei = new Random();  //乱数生成の準備
				int omikuji = tenkei.nextInt(100);//乱数0~99
				
				if(omikuji == 0) {
					
					System.out.println("大凶");
					
				}else if(omikuji <= 13) {
					System.out.println("凶");
					
				}else if(omikuji <= 29) {
					System.out.println("末吉");
					
				}else if(omikuji <= 57) {
					System.out.println("吉");
			
				}else if(omikuji <= 70) {
					System.out.println("小吉");
					
				}else if(omikuji <= 78) {
					System.out.println("中吉");
					
				}else if(omikuji <= 99) {
					System.out.println("大吉");
					
					
				};
				
			}
			else { // エンターキーが押されなかったとき
				System.out.println("最初からやり直してください");
			}
		} 
}