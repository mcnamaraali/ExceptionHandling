import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideByZeroNoException {
	
	public static int quotient (int num, int denom) throws
		ArithmeticException		{
		return num/denom;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continueLoop = true; //determines if more input is needed
		
		do {
			try {
				System.out.print("Please enter an integer numerator: ");
				int numerator = scanner.nextInt();
				System.out.print("Please enter an integer denominator: ");
				int denominator = scanner.nextInt();
				
				int result = quotient(numerator,denominator);
				System.out.printf("%n Result: %d /%d = %d%n", numerator, denominator, result);
				continueLoop = false;
		}
			catch(InputMismatchException inputMismatchException) {
				System.err.printf("%n Exception: %s%n", 
						inputMismatchException);
				scanner.nextLine();
				System.out.printf("Please enter integers only %n%n");
			}
			catch(ArithmeticException arithmeticException) {
				System.err.printf("%n arithmetic exception: %s%n", 
						arithmeticException);
				System.out.printf("Zero is an invalid denominator %n%n");
			}
			
		} while (continueLoop);
	}

}
