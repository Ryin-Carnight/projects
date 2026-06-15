import java.util.Scanner;
public class Exercise1104_11613 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("暗号化する文字列を記入してください");
		String English = scan.nextLine();
		
		for(int i = 0;i < English.length();i++) 
		{
			char c = English.charAt(i);
			if(c >= 88) 
			{
				c -= 23;
			}
			else c += 3;
			System.out.print(c);
		}
		
	}
}