import java.util.Random;
import java.util.Scanner;
public class Exercise1204_11613 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("暗号化する文字列をを入力してください");
		String cipher = scan.nextLine();
		System.out.println("鍵の長さをを入力してください");
		int key_range = scan.nextInt();
		int len = cipher.length();
		int count = len%key_range;
		int[][] key = new int[2][key_range];
		
		for(int i = 0;i < key_range-count;i++) 
		{
			cipher += " ";
			len++;
		}
		count = len/key_range;
		String[][] tenchi = new String[count][key_range];
		for(int i = 0;i < 2;i++) 							//とりあえず鍵の作成.
		{
			for(int j = 0;j < key_range;j++) 
			{
				key[i][j] = j + 1;	
			}
		}
		for(int i = key_range-1;i > 0;i--)					//暗号化した鍵の作成.
		{
			int shuffle = rand.nextInt(i + 1);
			int buffer = key[1][i];
			key[1][i] = key[1][shuffle];
            key[1][shuffle] = buffer;
		}
		for(int i = 0;i < count;i++) 						//鍵の通りに転置を行う.
		{
			for(int j = 0;j < key_range;j++) 
			{
				tenchi[i][j] = cipher.substring(key[1][j] + (i * key_range) - 1,key[1][j] + (i * key_range));
			}
		}
		for(int i = 0;i < count;i++) 						//暗号化した文を表示する.
		{
			for(int j = 0;j < key_range;j++) 
			{
				System.out.print(tenchi[i][j]);
			}
		}
		System.out.println();
		for(int i = 0;i < 2;i++) 							//暗号化した鍵を表示する.
		{
			System.out.print("|");
			for(int j = 0;j < key_range;j++) 
			{
				System.out.print(key[i][j] + " ");
			}
			System.out.println("|");
		}
	}
}