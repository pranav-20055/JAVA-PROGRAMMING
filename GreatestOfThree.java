import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        // Find the greatest of the three numbers
        int greatest = num1;
        
        if (num2 > greatest) {
            greatest = num2;
        }
        
        if (num3 > greatest) {
            greatest = num3;
        }
        
        // Output the greatest number
        System.out.println("The greatest number is: " + greatest);
        
        scanner.close();
    }
}
