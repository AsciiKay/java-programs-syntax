// for input
import java.util.Scanner;

// Fibonacci Numbers Sequence
// is a seq where each next number in seq
// is sum of two preceding numbers starting with 0, 1


public class Main{
	public static void main(String[] args) {	

		// input for How many numbers in fib's sequence
        Scanner input_n = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input_n.nextInt();

        // initializing array of n size/length
        int[] fib_arr = new int[n];
        // starting nums of seq i.e. 0, 1
        fib_arr[0] = 0;
        fib_arr[1] = 1;

        // Creating the sequence
        // starting with 2, since, first two values are initialized
        for (int index = 2; index < n; ++index) {
        	// next term[index] = array[index - 1] + array[index - 2]
            int tmp = fib_arr[index - 1] + fib_arr[index - 2];
            fib_arr[index] = tmp;
        }

        // Printing the fib's sequence
        System.out.println("\nFibonacci Sequence: ");
        for (int term_i = 0; term_i < n; ++term_i) {
            System.out.println(term_i + ". " + fib_arr[term_i]);
        }

    }
}
