import java.util.Scanner;
public class Exercise0902_11613 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max = n,min = n;
		int e = n;
		int f = n;
		
		for(int i = 1;i < 5;i++) 
		{
			int z = scan.nextInt();
			if(e < z)
			{
				max = z;
				e = z;
			}
			if(f > z) 
			{
				min = z;
				f = z;
			}
		}
		double flat = (max + min)/2.0;
		System.out.println(flat);
		System.out.println(max);
		System.out.println(min);
	}
		
}