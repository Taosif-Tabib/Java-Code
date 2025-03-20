
package factoriall;
import java.util.Scanner;

public class Factoriall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply the numbers in sequence
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
        scanner.close();
    }
}
