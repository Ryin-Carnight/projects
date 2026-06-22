import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String name = "山田 太郎";
        String no = "11202";
                ;
        Account a = new Account(name, no);

        System.out.println(a.toString());
        a.deposit(100000);
        System.out.println(a.toString());
        for(int i = 1000;a.withdraw(i);)
        {
            System.out.println(a.toString());
        }

    }
}
