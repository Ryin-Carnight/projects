import java.util.Random;
import java.util.Scanner;
public class Exercise1402_11613 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("行数を記入してください");
		int x = scan.nextInt();
		System.out.println("列数を記入してください");
		int y = scan.nextInt();
		System.out.println("要素数を記入してください");
		int conpornent = scan.nextInt();
		
		int[][] grid = new int[x][y];			//入力された段数*列数の行列の作成.
		int[][] transcription = new int [x][y];
		
		for(int i = 0;i < x;i++) 					//配列の初期化.
		{
			for(int f = 0;f < y;f++)
			{
				grid[i][f] = 0;
			}
		}
		int f = 0;
		int n = 0;
		for(int i = 0;i < conpornent;i++) 			//入力された要素分配列に1を代入.
		{
			grid[f][n] = 1;
			if(n == (y-1)) 
			{
				f++;
				n = 0;
			}else n++;
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
			transcription[x1][y1] = grid[x2][y2];
			grid[x2][y2] = fleedom;
			transcription[x2][y2] = fleedom;
		}
		grid = cent(x,y,grid);
		int seek = 0;
		while(seek == 0) 
		{
			for(int i = 0;i < x;i++) 
			{
				for(int j = 0;j < y;j++) 
				{
					if(transcription[i][j] == -1) System.out.print(grid[i][j]);
					else System.out.print("-");
				}
				System.out.println();
			}
			System.out.println("行を入力してください");
			int step = scan.nextInt();
			System.out.println("列を入力してください");
			int line = scan.nextInt();
			if(transcription[step-1][line-1] == 1) 
			{
				System.out.println("残念!!!失敗!!");
				for(int i = 0;i < x;i++) 						//i行f列の配列の値が1ならば「*」、0ならば「-」を出力する.
				{
					for(int j = 0;j < y;j++) 
					{
						if(transcription[i][j] == 1) 
						{
							System.out.print("*");
						}
						else System.out.print("-");
					}
					System.out.println();
				}
				break;
			}else 
			{
				transcription[step-1][line-1] = -1;
			}
			int any = 0;
			for(int i = 0;i < x;i++) 
			{
				for(int j = 0;j < y;j++) 
				{
					any += transcription[i][j];
				}
			}
			if((any*-1) == (x*y-conpornent*2)) 
			{
				seek = 1;
				System.out.println("おめでとう!!!成功だ!!!");
				for(int i = 0;i < x;i++) 						//i行f列の配列の値が1ならば「*」、0ならば「-」を出力する.
				{
					for(int j = 0;j < y;j++) 
					{
						if(transcription[i][j] == 1) 
						{
							System.out.print("*");
						}
						else System.out.print("-");
					}
					System.out.println();
				}
			}
		}
	}
	static int[][] cent(int x,int y,int grid[][]) 
	{
		int[][] copy = new int [x][y];
		for(int i = 0;i < x;i++) 
		{
			for(int j = 0;j < y;j++) 
			{
				int all = 0;
				for(int q = -1;q < 2;q++) 
				{
					for(int r = -1;r < 2;r++) 
					{
						if(i + q < 0 || i + q >= x || j + r < 0 || j + r >= y || (q == 0 && r == 0))continue ;
						all += grid[i + q][j + r];
					}
				}
				copy[i][j] = all;
			}
		}
		grid = copy;
		return grid;
	}
}