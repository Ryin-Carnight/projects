import java.util.Scanner;
public class Exercise1301_11613
{
	static int cent(int a,int b,int c) 
	{
		int center = a;
		center = a<b && a>c ? a:center; 
		center = a<c && a>b ? a:center;
		center = b<a && b>c ? b:center;
		center = b<c && b>a ? b:center;
		center = c<a && c>b ? c:center;
		center = c<b && c>a ? c:center;
		return center;
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int[] number = new int[3];
		for(int i = 0;i < 3;i++) 
		{
			System.out.println((i+1) + "つ目の整数を入力してください");
			number[i] = scan.nextInt();
		}
		int center = cent(number[0],number[1],number[2]);
		System.out.println(number[0] + "," + number[1] + "," + number[2] + "の中央値は" + center + "です");
	}
}