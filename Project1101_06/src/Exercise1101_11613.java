import java.util.Scanner;
public class Exercise1101_11613 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("文字列を記入してください");
		String English = scan.nextLine();
		
		for(int i = 0;i < English.length();i++) 
		{
			char c = English.charAt(i);
			if(c >= 65 && c <= 90) 
			{
				c += 32;
				System.out.print(c);
			}else if(c >= 97 && c <= 122) 
			{
				c -= 32;
				System.out.print(c);
			}
		}
		
	}
}