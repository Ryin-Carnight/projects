import java.util.Scanner;
public class kadai10_2_1 {
	public static void main(String[]args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("正の整数を入力してください");
		int natural_number = scan.nextInt();
		
		if(natural_number <= 0) {
			System.out.println("正の整数を入力してください");
		}else if (natural_number > 0) {
		for(int yakusuu = 1;yakusuu <= natural_number;yakusuu++) {
			if (natural_number % yakusuu == 0) {
				System.out.println(yakusuu);
			}
		}
		}
	}
}