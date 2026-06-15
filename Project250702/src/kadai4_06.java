import java.util.Scanner;
public class kadai4_06
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("項数を入力してください");
		int number = scan.nextInt();
		
		int siguma = 0;
		int infinity = 1;
		
		for(int i = 1;i <= number;i++)
		{
			System.out.println(siguma);
			int aruma = siguma + infinity;
			infinity = siguma;
			siguma = aruma;
		}
		
		
	}
}