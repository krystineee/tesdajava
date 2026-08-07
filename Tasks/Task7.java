import java.util.Scanner;

public class Task7
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int firstNum = input.nextInt();
		System.out.print("Enter second number: ");
		int secondNum = input.nextInt();
		
		System.out.println("\nSum: " + add(firstNum, secondNum));
		System.out.println("Difference: " + subtract(firstNum, secondNum));
		System.out.println("Product: " + multiply(firstNum, secondNum));
		
        int quotient = divide(firstNum, secondNum);
            if (secondNum != 0)
                System.out.println("Quotient: " + quotient);

		input.close();
	}
	
	public static int add(int a, int b){
	    int sum = a + b;
	    return sum;
	}
	
	public static int subtract(int a, int b){
	    int difference = a - b;
	    return difference;
	}
	
	public static int multiply(int a, int b){
	    int product = a * b;
	    return product;
	}
	
	public static int divide(int a, int b){
	    if (b == 0) {
	       System.out.println("Math Error: Cannot divide by zero.");
	       return 0;
	    }
	   int quotient = a / b;
	   return quotient;
	}
}