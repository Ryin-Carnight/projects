import java.util.Random;
import java.util.Scanner;
public class kadai2_06 
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		Random rand = new Random();
		
		int big_number = 10 + rand.nextInt(90);
		int answer = 0;
		do
		{
			System.out.println("2桁の数字を入力してください");
			answer = scan.nextInt();
			if(big_number == answer)
			{
				System.out.println("correcta‼");
			}else if(big_number != answer) 
			{
				if(answer > big_number)
				{
					System.out.println("もう少し小さいよ");
				}else if(answer < big_number) 
				{
					System.out.println("もう少し大きいよ");
				}
			}
		}while(answer != big_number);
	}
}

