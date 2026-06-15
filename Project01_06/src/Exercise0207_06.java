import java.util.Random;
public class Exercise0207_06 
{
	public static void main(String[] args) 
	{
		Random random = new Random();
		int rand1 =(random.nextInt(99)); //0～99の乱数
		int rand2 =(random.nextInt(99)); //0～99の乱数
		int rand3 =(random.nextInt(99)); //0～99の乱数
		
		int max = rand1;
		max = max > rand2 ? max:rand2;
		max = max > rand3 ? max:rand3;
		System.out.println(max + "が" + rand1 + "、" + rand2 + "、" + rand3 + "の中で一番大きい値です。");
	} 
}