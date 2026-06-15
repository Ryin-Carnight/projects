import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int year = 2020;
        int month = scan.nextInt();
        int day = 1;
        int dayofweek = 0;

        switch(month)
        {
            case 2: dayofweek = 29;
                break;
            case 4:
            case 6:
            case 9:
            case 11: dayofweek = 30;
                break;
            default: dayofweek = 31;
                break;
        }

        CalDate c = new CalDate(year, month, day);

        for(day = 1;day <= dayofweek;day++)
        {
            c.change(c.getyear(), c.getmonth(), day);
            System.out.println(c);
        }
    }
}