import java.util.Random;
public class Exercise0206_06 
{
	public static void main(String[] args) 
	{
		Random random = new Random();
		int rand1 =(random.nextInt(99)); //0～99の乱数
		int rand2 =(random.nextInt(99)); //0～99の乱数
		int rand3 =(random.nextInt(99)); //0～99の乱数
		int center = rand1;
		center = rand1<rand2 && rand1>rand3 ? rand1:center; 
		center = rand1<rand3 && rand1>rand2 ? rand1:center;
		center = rand1<rand3 && rand1>rand2 ? rand1:center;
		center = rand2<rand1 && rand2>rand3 ? rand2:center;
		center = rand2<rand3 && rand2>rand1 ? rand2:center;
		center = rand3<rand1 && rand3>rand2 ? rand3:center;
		center = rand3<rand2 && rand3>rand1 ? rand3:center;
		System.out.println(center + "が" + rand1 + "、" + rand2 + "、" + rand3 + "の値の中の中央値です。");
	} 
}