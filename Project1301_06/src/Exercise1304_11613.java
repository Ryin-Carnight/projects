import java.util.Random;
import java.util.Scanner;
public class Exercise1304_11613
{
	static int[][] cent(int x,int y,int conpornent) 
	{
		Random rand = new Random();
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
				f++;
				j = 0;
			}
			j++;
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
		return grid;
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("段数を入力してください");
		int x = scan.nextInt();
		System.out.println("列数を入力してください");
		int y = scan.nextInt();
		System.out.println("要素数を入力してください");
		int conpornent = scan.nextInt();
		int[][] shuffle = new int[x][y];
		int[][] known = new int[x][y];
		shuffle = cent(x,y,conpornent);
		for(int i = 0;i < x;i++) 						
		{
			for(int u = 0;u < y;u++) 
			{
				if(known[i][u] == 1) 
				{
					System.out.print("*");
					continue;
				}
				else System.out.print("?");
			}
			System.out.println();
		}
		boolean hit = false;
		int answer = 0;
		while(answer < conpornent) 
		{
			System.out.println("要素があると思われる段を入力してください");
			int step = scan.nextInt();
			System.out.println("要素があると思われる列を入力してください");
			int line = scan.nextInt();
			if(shuffle[step-1][line-1] == 1) 
			{
				hit = true;
				if(known[step-1][line-1] != 1) 
				{
					known[step-1][line-1] = 1;
					answer += 1;
				}
				System.out.println("当たり!!!");
			}else 
			{
				for(int i = 0;i < x;i++) 						
				{
					for(int u = 0;u < y;u++) 
					{
						if(known[i][u] == 1) 
						{
							System.out.print("*");
							continue;
						}
						else System.out.print("?");
					}
					System.out.println();
				}
			}	
		}
		for(int i = 0;i < x;i++) 						//i行f列の配列の値が1ならば「*」、0ならば「-」を出力する.
		{
			for(int u = 0;u < y;u++) 
			{
				if(shuffle[i][u] == 1) 
				{
					System.out.print("*");
				}
				else System.out.print("-");
			}
			System.out.println();
		}
	}
}