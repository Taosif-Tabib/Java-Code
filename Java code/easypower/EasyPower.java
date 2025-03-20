
package easypower;
import java.util.Scanner;

public class EasyPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        long result = 1;
        while (exponent-- > 0) { 
            result *= base;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
