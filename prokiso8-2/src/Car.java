public class Car
{
    //燃料タンクの最大容量,燃料の量
    private int tankSize, currentFuel;
    //燃費,現在位置
    private double mileage, position;

    Car(int tankSize, double mileage)
    {
        this.tankSize = tankSize;
        this.currentFuel = 0;
        this.mileage = mileage;
        this.position = 0.0;
    }

    boolean move(int n)
    {
        if(this.currentFuel > n)
        {
            this.position += n * mileage;
            this.currentFuel -= n;
            return true;
        }else
        {
            this.position += this.currentFuel * this.mileage;
            this.currentFuel = 0;
            return false;
        }
    }

    public String toString()
    {
        return "Fuel:" + this.currentFuel + "/" + this.tankSize + " Pos:" + this.position;
    }

    void fillUp()
    {
        this.currentFuel = this.tankSize;
    }

}
