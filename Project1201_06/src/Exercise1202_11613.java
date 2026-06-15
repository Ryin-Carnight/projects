import java.util.Scanner;
public class Exercise1202_11613 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("文字列を記入してください");
		String character = scan.nextLine();
		System.out.println("分割する文字数を記入してください");
		int div = scan.nextInt();
		int len = character.length();
		int count = len%div;
		
		if(count != 0) 
		{
			count = len/div + 1;
		}else count = len/div;
		String[] word  = new String[count];
		
		int index = 0;
		for(int i = 0;i < count-1;i++) 
		{
			word[i] = character.substring(index,(index+div));
			System.out.println(word[i]);
			index += div;
		}
			word[count-1] = character.substring(index,len);
			System.out.println(word[count-1]);
	}
}