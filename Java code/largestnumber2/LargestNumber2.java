
package largestnumber2;
import java.util.Scanner;

public class LargestNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) array[i] = scanner.nextInt();

        int largest = array[0];
        for (int i = 1; i < n; i++) 
            if (array[i] > largest) largest = array[i];

        System.out.println("Largest number: " + largest);
        scanner.close();
    }
}
