import java.util.Scanner;
public class Exercise0302_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("整数を入力してください");
		int i = scan.nextInt();
		int x = 0;
		if(i == 1) 
		{
			x = x + 1;
			x = x + 2;
			x = x + 4;
			x = x + 8;
		}else if(i == 2) 
		{
			x = x + 2;
			x = x + 4;
			x = x + 8;
		}else if(i == 3) 
		{
			x = x + 4;
			x = x + 8;
		}else 
		{
			x = x + 8;
		}
		System.out.println("i:" + i);
		System.out.println("x:" + x);
	}
		
}