class CalDate
{
	int year, month, day, dayofweek;
	String dayOfWeek;
	
	public CalDate(int y, int m, int d) 
	{
		this.year = y;
		this.month = m;
		this.day = d;
		
		zeller(year, month, day, dayofweek);
		
		switch(dayofweek) 
		{
			case 0:this.dayOfWeek = "Mon";
			break;
			case 1:this.dayOfWeek = "Tue";
			break;
			case 2:this.dayOfWeek = "Wed";
			break;
			case 3:this.dayOfWeek = "Thu";
			break;
			case 4:this.dayOfWeek = "Fri";
			break;
			case 5:this.dayOfWeek = "Sat";
			break;
			case 6:this.dayOfWeek = "Sun";
			break;
		}
	}
	
	void change(int year, int month, int day) 
	{
		this.year = year;
		this.month = month;
		this.day = day;
		
		zeller(year, month, day, dayofweek);
		
		switch(dayofweek) 
		{
			case 0:this.dayOfWeek = "Mon";
			break;
			case 1:this.dayOfWeek = "Tue";
			break;
			case 2:this.dayOfWeek = "Wed";
			break;
			case 3:this.dayOfWeek = "Thu";
			break;
			case 4:this.dayOfWeek = "Fri";
			break;
			case 5:this.dayOfWeek = "Sat";
			break;
			case 6:this.dayOfWeek = "Sun";
			break;
		}
	}
}

public void zeller(int year, int month, int day, int dayofweek)
{
	if(month == 1 || month == 2)
	{
		year--;
		month += 12;
	}
	
	//0～6が出力され，日～土に対応
	dayofweek = (year + year/4 - year/100 + year/400 + (13 * month + 8)/5 + day) % 7;
	
}