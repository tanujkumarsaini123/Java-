import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tanuj kumar Saini 24csu347");
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];

        int e = 0, o = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenArray[e++] = arr[i];
            } else {
                oddArray[o++] = arr[i];
            }
        }

        
        System.out.print("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nLength of Original Array: " + n);

        
        System.out.print("Even Array: ");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println("\nLength of Even Array: " + evenArray.length);

        
        System.out.print("Odd Array: ");
        for (int i = 0; i < oddArray.length; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println("\nLength of Odd Array: " + oddArray.length);

        sc.close();
    }
}
