
package oddsquareseries;
import java.util.Scanner;

public class OddSquareSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        int sum = 0;
        int num = 1;

        for (int i = 0; i < n; i++) {
            sum += num * num; 
            num += 2;         
        }

        System.out.println("The sum of the series is: " + sum);
        scanner.close();
    }
}
