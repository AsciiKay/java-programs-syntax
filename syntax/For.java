import java.util.Scanner;

// For loop 
// for loop is like while loop but has a definite end point 
// while loops are abstract in nature and can be infinte 
// for loops cannot be infinite

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a number:");
    int end = input.nextInt();  // End point for print squares till that number 
    
    // printing squares of all numbers till end var 
    for (int x = 1; x <= end; x++) {
      int sq = x * x;   // squaring 
      System.out.println("Square of " + x + " : " + sq);
    }
   
    System.out.println("\nEnter a number:");
    int tab = input.nextInt();   // number for printing its multiplication table 
    
    // Printing multiplication table of tab till 12 
    for (int i = 0; i <= 12; ++i) {
      int tmp = tab * i;
      System.out.println(i + " times " + tab + " is " + tmp);
    }
    
  }
}
