import java.util.Scanner;

public class ArraySumFunctions {

    
    static int sumAll(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    
    static int sumAlternate(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) { // step = 2 (0th, 2nd, 4th, ...)
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int totalSum = sumAll(arr);
        int alternateSum = sumAlternate(arr);

        System.out.println("Sum of all elements = " + totalSum);
        System.out.println("Sum of alternate elements = " + alternateSum);
        System.out.println("Tanuj kumar Saini 24csu347");
        sc.close();
    }
}
