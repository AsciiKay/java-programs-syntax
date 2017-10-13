import java.util.Scanner;

// While loop 
// used to perform task/tasks repeatedly untill 
// given condition is met 
// conditions are similar to those in conditionals

public class Main {
  public static void main(String[] args) {
    
    int end, i;
    end = 102;  //end variable
    i = 0;   // i or counting variable 
    
    // condition 
    while (i <= end) {
      // Checking if number is odd or even 
      if (i % 2 == 0) {
        System.out.println("\nEven: " + i);
      } else {
        System.out.println("Odd: " + i);  
      }
      // Incrementing to end loop 
      // otherwise it'll run forever!
      ++i;
    } 
    
  }
}
