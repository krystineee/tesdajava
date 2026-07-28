import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter String: ");
    
    String input = scan.nextLine();

    String palindrome = new StringBuilder(input).reverse().toString();
    
    if(input.equals(palindrome))
        System.out.println("The input string is a palindrome.");
    else
        System.out.println("The input string is not a palindrome.");

    scan.close();
    }
}
