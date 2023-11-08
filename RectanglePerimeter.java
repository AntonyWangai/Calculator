package math;
import java.util.Scanner;
public class RectanglePerimeter {
	Scanner in=new Scanner(System.in);
	public void perimeter( ) {
		System.out.print("Enter the  length:");
		int num1=in.nextInt();
		
		System.out.print("Enter the Width:");
		int num2=in.nextInt();
		
		int per=2*(num1+num2);
		System.out.println("The perimeter is"+per);
		
		
	}

}
