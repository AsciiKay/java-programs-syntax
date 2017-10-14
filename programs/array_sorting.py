// for input
import java.util.Scanner;

// Array sorting
// using bubble sort method

public class Main {
    public static void main(String[] args) {

        // Input for size of array
        Scanner input_n = new Scanner(System.in);
        System.out.println("Limit(integer) for arr: ");
        int n = input_n.nextInt();

        // setting size
        int[] arr = new int[n];

        System.out.println("");

        // Taking input 'n' times where n is size/length of arr
        for (int elem_i = 0; elem_i < n; ++elem_i) {
            Scanner input_elem = new Scanner(System.in);
            System.out.println(elem_i + ". Item: ");
            int elem = input_elem.nextInt();
            arr[elem_i] = elem;
        }

        // Priniting un-sorted array to screen
        System.out.println("\nUn-sorted Array:");
        for (int i = 0; i < n; ++i) {
            System.out.println(arr[i]);
        }

        // Sorting array using bubble sort method
        for (int time = 0; time < n; ++time) {
            for (int index = 0; index < n - 1; ++index) {
                // For swapping 
                int i = arr[index];
                int j = arr[index + 1];

                // Comparing values to swap 'em
                if (i > j) {
                    arr[index + 1] = i;
                    arr[index] = j;
                }

            }
        }

        // Printing the sorted array to screen
        System.out.println("\nSorted Array:");
        for (int x = 0; x < n; ++x) {
            System.out.println(arr[x]);
        }

    }
}
