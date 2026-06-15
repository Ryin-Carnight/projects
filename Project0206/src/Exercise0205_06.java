import java.util.Random;
public class Exercise0205_06 
{
	public static void main(String[] args) 
	{
		Random random = new Random();
		int rand1 =(random.nextInt(99)); //0～99の乱数
		int rand2 =(random.nextInt(99)); //0～99の乱数
		int rand3 =(random.nextInt(99)); //0～99の乱数
		
		int min = rand1<rand2 ? rand1:rand2;
		min = rand3<min ? rand3:min;
		System.out.println(min + "が" + rand1 + "、" + rand2 + "、" + rand3 + "の中で一番小さい値です。");
	} 
}