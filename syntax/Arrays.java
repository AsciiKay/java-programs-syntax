import java.util.Scanner;

// Arrays 
// are collection of elements 
// can be of types ints, doubles, floats, strings, chars 

public class Main {
    public static void main(String[] args) {
        // Simple arrays 
        // [] can contain size of array
        int[] arr_of_ints = {1, 1, 2, 3, 5, 8, 13, 21};
        double[] arr_of_doubs = {3.1, 3.14, 3.141, 3.1415, 3.14159};
        String[] arr_of_strs = {"Axe", "Hunter's knife", "Compass", 
    							"Chocolate bar's", "Lighter"};
    	char[] arr_of_chars = {'K', 'A', 'L', 'P', 'A', 'K'};
        
        // Initializing arrays
        // needs specific size 
        int size = 90;
        int[] seq = new int[size];
        double[] temperatures = new double[size];

        System.out.println("Backpack: ");
        // Accessing elements, .length attr of arrays
        //
        // Elements of array : "Axe"  "Compass"  "Knife"
        // Index of elements :   0         1         2
        // 
        // .length is attribute of arrays, giving its size
        for (int i = 0; i < arr_of_strs.length; ++i) {
        	System.out.println("> " + arr_of_strs[i]);
        }

        
    }
}
