import java.util.Random;
public class Exercise0204_06 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int ten_number = (rand.nextInt(20) - 10); //-10～10の乱数
		
		int absolute = ten_number < 0 ? ten_number * -1:ten_number;
		if(absolute >= 3 && absolute <= 5) 
		{
			System.out.println(ten_number + "は絶対値が3以上５以下の値です。");
		}else 
			System.out.println(ten_number + "は絶対値が3以上５以下の値でではありません。");
	} 
}