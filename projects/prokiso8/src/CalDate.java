public class CalDate
{
    private int year, month, day;
    private String dayOfWeek;

    CalDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.dayOfWeek = zeller(this.year, this.month, this.day);
    }
    private String zeller(int year, int month, int day)
    {
        if(month == 1 || month == 2)
        {
            year--;
            month += 12;
        }
        //0～6が出力され，日～土に対応.
        int week = (year + year/4 - year/100 + year/400 + (13 * month + 8)/5 + day) % 7;

        switch (week)
        {
            case 0: this.dayOfWeek = "Sun";
                break;
            case 1: this.dayOfWeek = "Mon";
                break;
            case 2: this.dayOfWeek = "Tue";
                break;
            case 3: this.dayOfWeek = "Wed";
                break;
            case 4: this.dayOfWeek = "Thu";
                break;
            case 5: this.dayOfWeek = "Fri";
                break;
            case 6: this.dayOfWeek = "Sat";
                break;
        }
        return this.dayOfWeek;
    }
    public String toString()
    {
        return year + "/" + month + "/" + day + "(" + dayOfWeek + ")";
    }
    int getyear()
    {
        return this.year;
    }
    int getmonth()
    {
        return this.month;
    }
    int getday()
    {
        return this.day;
    }
    String getdayOfWeek()
    {
        return this.dayOfWeek;
    }
    void change(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.dayOfWeek = zeller(this.year, this.month, this.day);
    }
}
