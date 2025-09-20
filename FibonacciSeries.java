import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tanuj kumar Saini 24csu347");
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (n == 1) {
            System.out.println(first);
        } else {
            System.out.print(first + ", " + second);

            for (int i = 3; i <= n; i++) {
                int next = first + second;
                System.out.print(", " + next);
                first = second;
                second = next;
            }
            System.out.println(); 
        }

        sc.close();
    }
}
