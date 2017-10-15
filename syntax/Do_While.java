import java.util.Scanner;

// Do while loops
// are similar to while loops, but 
// are guranteed to run at least once 

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input for start point 
        System.out.println("Enter start point number:");
        int n = input.nextInt();
        
        // Input for end point
        System.out.println("Enter end point number:");
        int z = input.nextInt();
        
        // Loop to print all cubes of numbers till end but not of end 
        do {
            System.out.println(n * n * n);
            ++n;
        } while (n != z);  // condition
        
    }
}
