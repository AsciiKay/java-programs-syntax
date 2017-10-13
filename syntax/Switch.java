import java.util.Scanner;

// Switch construct and sturcture
// Switch is like if else's but much more 
// plain and simple

public class Main {
    public static void main(String[] args) {
        String day = "Friday";
        
        switch (day) {
            case "Sunday":
                System.out.println("Enjoy, it's holiday!");
                break;
            case "Monday":
                System.out.println("Get up, you got work!");
                break;
            case "Tuesday":
                System.out.println("It's the movie day!");
                break;
            case "Wednesday":
                System.out.println("Freaky wednesday!");
                break;
            case "Thursday":
                System.out.println("Waiting for friday night!");
                break;
            case "Friday":
                System.out.println("It's the friday night baby!");
                break;
            case "Saturday":
                System.out.println("Don't get up untill noon!");
                break;
            default:
                System.out.println("Just the default case!");
        }
        
    }
}
