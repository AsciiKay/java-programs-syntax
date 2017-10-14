// Multi-dimensional arrays 
// are simply arrays inside array/s 

public class Main {
    public static void main(String[] args) {
        
        // Two dimensional array 
        int[][] location = {{1, 2}, {9, 10}};
        
        // While accessing element from array 
        // the first index is of sub-array and second is of element 
        int x_1 = location[0][0]; int x_2 = location[1][0];
        int y_1 =  location[0][1]; int y_2 =  location[1][1]; 
    
        System.out.println("X's co-ordinate's: " + x_1 + ", " + x_2);
        System.out.println("Y's co-ordinate's: " + y_1 + ", " + y_2);
        
    }
}
