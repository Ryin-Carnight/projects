import java.util.Scanner;
public class kadai3_06 
{
	public static void main( String[] args ) 
	{
		Scanner scan = new Scanner( System.in );
		
		System.out.println("数字を入力してください");
		int number = scan.nextInt();
		int yakusuu = 1;
		for(int i = 1;i <= number;i++)
		{
			for(yakusuu = 2;yakusuu <= i;yakusuu++) 
			{
				if(yakusuu != i && i % yakusuu == 0)
				{
					break;
				}
				else if(i == yakusuu) 
				{
					System.out.println(i);
					break;
				}
			}
		}		
		
	}
}
