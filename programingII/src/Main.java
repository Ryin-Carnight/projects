import java.util.Scanner;

import org.w3c.dom.css.Rect;

public class Main 
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
	    int x = scan.nextInt();
	    int y = scan.nextInt();
	    
	    CalDate p = new CalDate(x, y, y);
	    Rect r = new Rect(p.x, p.y);
	    for(int i = 0;i < 4;i++) 
	    {
	    	System.out.print( "(" + r.points[i].x + ","  + r.points[i].y + ") ");
	    }
	    System.out.println("Area:" + r.area);
	}
}