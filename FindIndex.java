import java.util.Scanner;

public class FindIndex {
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

        
        System.out.print("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        
        System.out.print("Enter the number to search: ");
        int search = sc.nextInt();

      
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                index = i;
                break;
            }
        }

        
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("-1 (Element not present in array)");
        }

        sc.close();
    }
}
