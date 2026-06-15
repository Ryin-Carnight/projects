import java.util.Scanner;
public class Exercise0301_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("整数を入力してください");
		int number = scan.nextInt();
		
		int cut_number = number%2; //偶数なら0、奇数なら1が入る(2の余りをcut_numberに入れる。)
		switch(cut_number)
		{
			case 0:System.out.println(number + "は偶数です");break;
			case 1:System.out.println(number + "は奇数です");break;
		}
	}
		
}