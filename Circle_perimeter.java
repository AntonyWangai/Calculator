package math;
import java.util.Scanner;
public class Circle_perimeter 
{
	final double pi = 3.412;
	Scanner in = new Scanner(System.in);
	public void circle_per()
	{
		System.out.println("Enter radius: ");
		float radius=in.nextFloat();
		double per = pi*(radius*radius);
		System.out.println("Your perimeter is: " +per);
	}
}
