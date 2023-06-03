package excercise_1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.print("Enter number:");
		int number=scn.nextInt();
		System.out.print("Enter divisor:");
		int divisor=scn.nextInt();
		
		int quotient=number/divisor;
		int remainder=number-quotient*divisor;
		System.out.print("The quotient and remainder are "+quotient+" and "+remainder);
	}
}
