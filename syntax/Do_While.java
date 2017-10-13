import java.util.Scanner;

// Do while loops
// are similar to while loops, but 
// are guranteed to run at least once 

public class Main {
    public static void main(String[] args) {
        // Input for start point 
        Scanner input_n = new Scanner(System.in);
        System.out.println("Enter start point number:");
        int n = input_n.nextInt();
        
        // Input for end point 
        Scanner input_z = new Scanner(System.in);
        System.out.println("Enter end point number:");
        int z = input_z.nextInt();
        
        // Loop to print all cubes of numbers till end but not of end 
        do {
            System.out.println(n * n * n);
            ++n;
        } while (n != z);  // condition
        
    }
}
