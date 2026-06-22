import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String color = "黄色";
        String no = "1120";

        Car c = new Car(color, no);
        Slot s = new Slot();

        System.out.println(c.toString());
        System.out.println(s.toString());
        s.contract(c);
        s.carIn(c);
        s.check();
        System.out.println(s.toString());
        s.carOut();
        System.out.println(s.toString());
        Car d = new Car("青色", "122");

        s.carIn(d);
        System.out.println(s.toString());
        s.check();
        s.cancel();
    }
}
