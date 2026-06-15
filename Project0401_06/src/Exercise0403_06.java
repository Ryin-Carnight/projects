import java.util.Scanner;
public class Exercise0403_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("整数を入力してください");
		int first_number = scan.nextInt();
		System.out.println("整数を入力してください");
		int second_number = scan.nextInt();
		
		if(first_number < second_number) 
		{
			for(;first_number <= second_number;) 
			{
				System.out.println(first_number);
				first_number++;
			}
		}else if(second_number < first_number) 
		{
			for(;first_number >= second_number;) 
			{
				System.out.println(first_number);
				first_number-- ;
			}
		}
	}
		
}