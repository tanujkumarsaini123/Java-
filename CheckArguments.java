import java.util.Scanner;


class CheckArgumentException extends Exception {
    CheckArgumentException(String msg) {
        super(msg);
    }
}

public class CheckArguments {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
        
            System.out.print("Enter number of arguments: ");
            int n = sc.nextInt();

        
            int sum = 0;
            System.out.println("Enter the values:");
            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }

        
            if (n < 5)
                throw new CheckArgumentException("At least 5 arguments required!");

        
            System.out.println("Sum = " + sum);

        } catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
