
package shortseries;

import java.util.Scanner;

public class ShortSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        int sum = 0, num = 1;
        for (int i = 0; i < n; i++, num += 2) {
            sum += num * num;
        }

        System.out.println("Sum of the series: " + sum);
        scanner.close();
    }
}
