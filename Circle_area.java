package math;
import java.util.Scanner;
public class Circle_area {

	final double pi = 3.412;
	Scanner in = new Scanner(System.in);
	public void circle_area()
	{
		System.out.println("Enter radius: ");
		float radius=in.nextFloat();
		double area = pi * (radius*radius);
		System.out.println("Area is: "+area);
	}
}
