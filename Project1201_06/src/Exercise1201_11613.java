import java.util.Random;
import java.util.Scanner;
public class Exercise1201_11613 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("段数を記入してください");
		int x = scan.nextInt();
		System.out.println("列数を記入してください");
		int y = scan.nextInt();
		System.out.println("要素数を記入してください");
		int conpornent = scan.nextInt();
		
		int[][] grid = new int[x][y];			//入力された段数*列数の行列の作成.
		
		for(int i = 0;i < x;i++) 					//配列の初期化.
		{
			for(int f = 0;f < y;f++)
			{
				grid[i][f] = 0;
			}
		}
		int f = 0;
		int j = 0;
		for(int i = 0;i < conpornent;i++) 			//入力された要素分配列に1を代入.
		{
			grid[f][j] = 1;
			if(j == (y-1)) 
			{
				f += 1;
				j = 0;
			}else j += 1;
		}
		
		int pos = x * y;
		for(int i = pos - 1;i > 0;i--) 					//シャッフルアルゴリズム.
		{
			int shuffle = rand.nextInt(i + 1);
			int x1 = i/y;
			int y1 = i%y;
			int x2 = shuffle/y;
			int y2 = shuffle%y;
			
			int fleedom = grid[x1][y1];
			grid[x1][y1] = grid[x2][y2];
			grid[x2][y2] = fleedom;
		}
		for(int i = 0;i < x;i++) 						//i行f列の配列の値が1ならば「*」、0ならば「-」を出力する.
		{
			for(int u = 0;u < y;u++) 
			{
				if(grid[i][u] == 1) 
				{
					System.out.print("*");
				}
				else System.out.print("-");
			}
			System.out.println();
		}
	}
}