package math;
import java.util.Scanner;

public class Subtraction {
    
	Scanner in = new Scanner(System.in);
public void difference() {
    
    System.out.print("Enter the first number: ");
    int firstNumber = in.nextInt();

    System.out.print("Enter the second number: ");
    int secondNumber = in.nextInt();

    int difference= firstNumber-secondNumber;
    System.out.println("The difference is " + difference);
}

}

