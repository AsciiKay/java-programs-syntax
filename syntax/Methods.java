import java.util.Scanner;

// Methods of class 
// methods of class(object) define its behaviour
// they are collection of statements 
// Method once defined can be re-used infinite times,
// with different input 
// example 

public class Main {
    // Simple Method 
    static void say_hello(String name) {
        System.out.println("\nHello, " + name + "!");
    }
    
    public static void main(String[] args) {
        // INput for name 
        Scanner input_name = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input_name.next();
        
        // Method's usage example
        // calling method 
        say_hello(name);
        
        // Methods can be called as many times as user wants
        // Methods can take arguments or input 
        // above function takes one arg name 
    }
}
