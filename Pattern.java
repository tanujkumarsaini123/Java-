import java.util.Scanner;

public class Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        System.out.println("Tanuj kumar saini 24csu347");

        do {
            
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();

            
            char ch = '*';  

            System.out.println("\nRhombus:");
            for (int i = 1; i <= rows; i++) {
                for (int j = i; j < rows; j++) System.out.print(" ");
                for (int j = 1; j <= (2 * i - 1); j++) System.out.print(ch);
                System.out.println();
            }
            for (int i = rows - 1; i >= 1; i--) {
                for (int j = rows; j > i; j--) System.out.print(" ");
                for (int j = 1; j <= (2 * i - 1); j++) System.out.print(ch);
                System.out.println();
            }

        
            System.out.println("\nLeft Triangle:");
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) System.out.print(ch);
                System.out.println();
            }

            
            System.out.println("\nRight Triangle:");
            for (int i = 1; i <= rows; i++) {
                for (int j = i; j < rows; j++) System.out.print(" ");
                for (int j = 1; j <= i; j++) System.out.print(ch);
                System.out.println();
            }

            
            System.out.println("\nPyramid:");
            for (int i = 1; i <= rows; i++) {
                for (int j = i; j < rows; j++) System.out.print(" ");
                for (int j = 1; j <= (2 * i - 1); j++) System.out.print(ch);
                System.out.println();
            }

            
            System.out.print("\nDo you want to try again? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice != 'N' && choice != 'n');

        System.out.println("Program exited");
        sc.close();
    }
}

