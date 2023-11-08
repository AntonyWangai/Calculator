package math;
import java.util.Scanner;
public class division {
	Scanner in=new Scanner(System.in);
	public void divide() {
		System.out.println("Enter Dividend: ");
		double num1=in.nextDouble();
		System.out.println("Enter Divisor: ");
		double num2=in.nextDouble();
		double result=num1/num2;
		System.out.println("The result is: "+result);
}

}
