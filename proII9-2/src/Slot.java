public class Slot
{
    private Car car;//駐車している車
    private String contColor, contNo;//契約車の色,ナンバー

    Slot()
    {
        this.car = null;
        this.contColor = "NoCont";
        this.contNo = "NoCont";
    }

    boolean contract(Car car)
    {
        if(this.contColor == "NoCont" && this.contNo == "NoCont")
        {
            this.contColor = car.getColor();
            this.contNo = car.getNo();
            return true;
        }else return false;
    }

    boolean check()
    {
        if(this.car == null)return true;
        else if(car.getNo() == contNo && car.getColor() == contColor)return true;
        else return false;
    }

    boolean carIn(Car car)
    {
        if(this.car == null)
        {
            this.car = car;
            return true;
        }else return false;
    }

    Car carOut()
    {
        if(this.car != null)
        {
            Car c = this.car;
            this.car = null;
            return c;
        }else return null;
    }

    public String toString()
    {
        if(car != null) return this.car.getNo() + "(" + this.car.getColor() + "): " + this.contNo + "(" + this.contColor + ")";
        else return "no car: " + this.contNo + "(" + this.contColor + ")";
    }

    void cancel()
    {
        this.contColor = "NoCont";
        this.contNo = "NoCont";
    }
}
