public class Car
{
    private String color, no;//車の色,車のナンバー

    Car(String color,String no)
    {
        this.color = color;
        this.no = no;
    }
    String getColor()
    {
        return this.color;
    }
    String getNo()
    {
        return this.no;
    }
    public String toString()
    {
        return this.no + "(" + this.color + ")";
    }
}
