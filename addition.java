package math;
import java.util.Scanner;
public class addition {
	Scanner in=new Scanner(System.in);
public void sum( ) {
	System.out.print("Enter the first number:");
	int num1=in.nextInt();
	
	System.out.print("Enter the Second number:");
	int num2=in.nextInt();
	
	int sum=num1+num2;
	System.out.println("The sum is: "+sum);
	
	
}

}
