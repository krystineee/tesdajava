import java.util.Scanner;

public class Task5 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter three(3) numbers: ");

    int firstNum = input.nextInt();
    int secNum = input.nextInt();
    int lastNum = input.nextInt();

    if(firstNum == secNum && secNum == lastNum)
            System.out.println("All numbers are equal.");
    else{
            int largest = firstNum;
            
            if(secNum > largest)
                largest = secNum;
            
            if(lastNum > largest)
                largest = lastNum;
            System.out.println("The largest number is: " + largest);
        }
     input.close();
    }
}