import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tanuj 24csu347");

        
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();
        double discriminant = b * b - 4 * a * c;

        System.out.println("\nEquation: " + a + "x^2 + " + b + "x + " + c + " = 0");

        if (discriminant > 0) {
        
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two distinct real roots:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);

        } else if (discriminant == 0) {
            
            double root = -b / (2 * a);
            System.out.println("One real root (repeated): " + root);

        } else {
            
            System.out.println("No real roots. Discriminant < 0, roots are imaginary.");
        }

        sc.close();
    }
}
