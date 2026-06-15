public class CalDate
{
	int year, month, day, dayofweek;
	String dayOfWeek;
	
	public CalDate(int y, int m, int d) 
	{
		this.year = y;
		this.month = m;
		this.day = d;
		
		this.dayofweek = zeller(year, month, day, dayofweek);
		
		switch(this.dayofweek) 
		{
			case 0:this.dayOfWeek = "Sun";
			break;
			case 1:this.dayOfWeek = "Mon";
			break;
			case 2:this.dayOfWeek = "Tue";
			break;
			case 3:this.dayOfWeek = "Wed";
			break;
			case 4:this.dayOfWeek = "Thu";
			break;
			case 5:this.dayOfWeek = "Fri";
			break;
			case 6:this.dayOfWeek = "Sat";
			break;
		}
	}
	
	void change(int year, int month, int day) 
	{
		this.year = year;
		this.month = month;
		this.day = day;
		
		this.dayofweek = zeller(this.year, this.month,this. day, this.dayofweek);
		
		switch(this.dayofweek) 
		{
			case 0:this.dayOfWeek = "Sun";
			break;
			case 1:this.dayOfWeek = "Mon";
			break;
			case 2:this.dayOfWeek = "Tue";
			break;
			case 3:this.dayOfWeek = "Wed";
			break;
			case 4:this.dayOfWeek = "Thu";
			break;
			case 5:this.dayOfWeek = "Fri";
			break;
			case 6:this.dayOfWeek = "Sat";
			break;
		}
	}
	public int zeller(int year, int month, int day, int dayofweek)
	{
		if(month == 1 || month == 2)
		{
			year--;
			month += 12;
		}
		
		//0～6が出力され，日～土に対応.
		dayofweek = (year + year/4 - year/100 + year/400 + (13 * month + 8)/5 + day) % 7;
		return dayofweek;
	}
}

