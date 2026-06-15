import java.util.Scanner;
public class Exercise1103_11613 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] English = new String[5];
		boolean agreement = false;
		int count = 0;
		
		for(int i = 0;i < 5;i++) 
		{
			System.out.println("検索対象の" + (i+1) + "つ目の文字列を記入してください");
			English[i] = scan.nextLine();
		}
		System.out.println("検索する文字列を記入してください");
		String search = scan.nextLine();
		
		for(int i = 0;i < 5;i++) 
		{
			English[i].indexOf(search);
			if(-1 != English[i].indexOf(search)) 
			{
				System.out.println(English[i]);
			}else if(-1 == English[i].indexOf(search)) 
			{
				count++;
			}
			
		}
		if(count == 5)System.out.println("検索した文字列を含む文字列が存在しません");
		
	}
}