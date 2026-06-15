import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        String name = in.next();

        Student a = new Student(id, name, 3);
        System.out.println("[" + a.id + "]·" + a.name + "·grade:" + a.grade);

        Student b = new Student(id, name);
        System.out.println("[" + b.id + "]·" + b.name + "·grade:" + b.grade);
    }
}
class Student
{
	int id = 0;
	String name = "";
	int grade = 0;
	
	public Student(int i, String n, int g) {
		
	}
	public Student(int i, String n) {
		
	}
	
}
