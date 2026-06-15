import java.util.Scanner;
public class kadai2_06
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("所持金を入力してください");
		int money = scan.nextInt();
		int lost = 0;
		int atm =0;
		
		for(;money >= lost;)
		{
			System.out.println("商品の価格を入力してください(0で終了)");
			int lost_money = scan.nextInt();
			
			if(money - lost > 0)
			{
				lost = lost + lost_money;
				System.out.println("現在の合計：" + lost);
				atm = money - lost;
			}else if(money - lost == 0) 
			{
				lost = lost + lost_money;
			}
		}
		System.out.println("お金が足りません！");
		System.out.println("買い物を終了しました。残額:" + atm + "円");
	}
}