import java.util.Scanner;

public class RightTrianglePatternNumber {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt(); 
        int num=1;
        for(int i = 1; i < row; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num +" ");  
                num++;
            }
            System.out.println(); 
        }
        
        scanner.close();  
    }
}