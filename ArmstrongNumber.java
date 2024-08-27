import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int result = 0;
        int n = 0;

        // Count the number of digits in the number
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = number;

        // Compute the sum of nth power of its digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            result += Math.pow(digit, n);
            originalNumber /= 10;
        }

        // Check if the number is an Armstrong number
        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
