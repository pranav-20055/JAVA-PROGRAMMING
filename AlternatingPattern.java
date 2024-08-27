import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();  
        for(int i = 0; i < rows; i++) {  
            int value = i % 2;  
            for(int j = 0; j <= i; j++) {  
                System.out.print(value + " ");
                value = 1 - value;  
            }
            System.out.println();
        }
        
        scanner.close();  
    }
}