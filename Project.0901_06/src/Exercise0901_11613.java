import java.util.Scanner;
public class Exercise0901_11613 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		long n = 1;
		if(i == 4) 
		{
			n *= 816_381;
			n *= 631_620;
			n *= 418_314;
			
		}
		if(i == 2) 
		{
			n *= 631_620;
			n *= 418_314;
			
		}
		if(i == 3) 
		{
			n *= 418_314;
			
		}
		if(i == 1) 
		{
			n *= 702_054;
			
		}
		if(i == 0) 
		{
			n *= 705_302;
			n *= 944_131;
		}
		if(i != 0 && i != 1 && i != 2 && i != 3 && i != 4) 
		{
			n *= 944_131;
		}
		System.out.println(n);
		n = 1;
		switch(i) 
		{
			case 0: n *= 705_302;
			default: n *= 944_131;break;
			case 4: n *= 816_381;
			case 2: n *= 631_620;
			case 3: n *= 418_314;break;
			case 1: n *= 702_054;break;
		}
		System.out.println(n);
	}
		
}