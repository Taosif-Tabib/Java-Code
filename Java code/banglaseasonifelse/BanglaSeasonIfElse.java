
package banglaseasonifelse;
import java.util.Scanner;

public class BanglaSeasonIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month (1 for January, 2 for February, etc.): ");
        int month = scanner.nextInt();

        if (month == 3 || month == 4) {
            System.out.println("The season is Spring (Boshonto).");
        } else if (month == 5 || month == 6) {
            System.out.println("The season is Summer (Grishho).");
        } else if (month == 7 || month == 8) {
            System.out.println("The season is Rainy (Borsha).");
        } else if (month == 9 || month == 10) {
            System.out.println("The season is Autumn (Shorot).");
        } else if (month == 11 || month == 12) {
            System.out.println("The season is Late Autumn (Hemonto).");
        } else if (month == 1 || month == 2) {
            System.out.println("The season is Winter (Sheet).");
        } else {
            System.out.println("Invalid month! Please enter a value between 1 and 12.");
        }

        scanner.close();
    }
}
