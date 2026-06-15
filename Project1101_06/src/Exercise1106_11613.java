import java.util.Scanner;
public class Exercise1106_11613 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("文字列を記入してください");
		String s1 = scan.nextLine();
		
		for(int i = 0;i < s1.length();i++) 
		{
			int count = 0;
			char c = s1.charAt(i);
			for(;(s1.substring(i,s1.length())).indexOf(c) == 0;i++) 
			{
				count++;
			}
			System.out.printf("%2d",count);
			i--;
			int result = tasizan(1, 2);
		}
		
	}
	public static int tasizan(int a, int b) 
	{
		int r = a + b;
		return r;
	}
}
