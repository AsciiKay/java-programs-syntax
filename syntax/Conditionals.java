import java.util.Scanner;

// Conditionals and comparison operators
// if, else if, else statements are used to build 
// decision making constructs 
// if elses can be nested as many times as programmer wants 
// like if inside if inside if and so on...
// 
// Comparison operators
// == : equals
// != : not equals 
// > : greater than 
// < : less than 
// >= : greater than equal to 
// <= less than equal to 

public class Main {
	public static void main(String[] args) {
	  
	    Scanner input_x = new Scanner(System.in);
	    Scanner input_y = new Scanner(System.in);
	    
	    System.out.println("Enter a number:");
	    int x = input_x.nextInt();
	    
	    System.out.println("Enter another number:");
	    int y = input_y.nextInt();
	    System.out.println("");
	    
	    if (x > y) {
	      System.out.println(x + " is greater than " + y);
	    } else if (y > x) {
	      System.out.println(y + " is greater than " + x);
	    } else if (x == y) {
	      System.out.println(x + " is equal to " + y);
	    } else {
	      System.out.println("This should never occur!21");
	    }
	    
	}
}
