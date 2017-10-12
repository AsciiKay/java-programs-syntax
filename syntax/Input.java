import java.util.Scanner; 
// Taking input using Scanner from javas core libraries
// First create a scanner Object
// Then take input using specific method callings on that object 
// Methods List : 
// nextLine() : for complete line 
// nextInt() : for reading an integer from input stream 
// nextChar() : for reading char 
// nextDouble()/nextFloat() : for reading a double/float 
// nextBoolean() : for reading a boolean value 
// nextLong() : for reading a long 
// next() : for a word 


class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner input_n = new Scanner(System.in);
        int n = input_n.nextInt();
        n += 1;
        int tmp = n - 1;
        System.out.println(tmp + " incremented is " + n + "\n");
        
        System.out.println("Enter your name:");
        Scanner input_name = new Scanner(System.in);
        String name = input_name.next();
        System.out.println("Hmm.. so you are " + name + ", \nNice to meet you!");
    }
}
