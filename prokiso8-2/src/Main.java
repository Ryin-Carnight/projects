import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int tankSize = 100;
        int mileage = 1
                ;
        Car c = new Car(tankSize, mileage);

        c.fillUp();
        System.out.println(c);

        boolean fin = true;
        for(int i = 0;fin;i++)
        {
            fin = c.move(r.nextInt(10)+1);
            System.out.println(c);
        }

    }
}
