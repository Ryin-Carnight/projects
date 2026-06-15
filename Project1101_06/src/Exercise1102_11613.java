import java.util.Scanner;
public class Exercise1102_11613 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] English = new String[5];
		boolean agreement = false;
		
		for(int i = 0;i < 5;i++) 
		{
			System.out.println("検索対象の" + (i+1) + "つ目の文字列を記入してください");
			English[i] = scan.nextLine();
		}
		System.out.println("検索する文字列を記入してください");
		String search = scan.nextLine();
		for(int i = 0;i < 5;i++) 
		{
			if(search.equals(English[i])) 
			{
				agreement = true;
			}
		}
		if(agreement == true)System.out.println("検索した文字列と一致する文字列が存在します");
		else if(agreement ==false) System.out.println("検索した文字列と一致する文字列が存在しません");
	}
}