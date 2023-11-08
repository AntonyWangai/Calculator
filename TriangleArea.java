package math;
import java.util.Scanner;
public class TriangleArea {
	Scanner in=new Scanner(System.in);
	public void trangarea( ) {
		System.out.print("Enter the base:");
		double num1=in.nextInt();
		
		System.out.print("Enter the height:");
		double num2=in.nextInt();

		double area= 0.5*(num1*num2);

		System.out.println("The area is: "+area);
		
		
	}

}
