import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("Tanuj  kumar saini 24csu347");
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        boolean isPrime = true;

       
        if (num <= 1) {
            isPrime = false;  // numbers <= 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        
        if (isPrime) {
            System.out.println(num + " is Prime.");
        } else {
            System.out.println(num + " is Not Prime.");
        }

        sc.close();
    }
}
