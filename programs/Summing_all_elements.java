
import java.util.Scanner;

// Summing all elements 
// in an given array

public class Main {
	public static void main(String[] args) {

		// Input for size/length of array
		Scanner input_n = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = input_n.nextInt();

		// Initializing array
		double[] arr = new double[n];

		System.out.println("");

		// Taking input 'n' times and assigning particular values 
		// to their indexes of array
		for (int ind = 0; ind < n; ++ind) {
			Scanner input_elem = new Scanner(System.in);
			System.out.println(ind + ". Item: ");
			arr[ind] = input_elem.nextDouble();
		}

		// Summing all elements
		double sum = 0;
		for (int i = 0; i < n; ++i) {
			sum += arr[i];
		}

		// Printing sum
		System.out.println("Sum of arr: " + sum);

	}
}
