import java.util.Scanner;
public class Exercise1105_11613 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("一つ目の文字列を記入してください");
		String s1 = scan.nextLine();
		System.out.println("二つ目の文字列を記入してください");
		String s2 = scan.nextLine();
		int count = 0;
		
		for(int i = 0;i < (s1.length() - s2.length());i++) 
		{
			System.out.println(i);
			 if((s1.substring(i,s1.length())).indexOf(s2) >= 0) 
			 {
				 count++;
				i += (s1.substring(i,s1.length())).indexOf(s2);
			 }
		}
		System.out.println(s1 + "に含まれる" + s2 + "の個数は" + count + "個です");
	}
}