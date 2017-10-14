// `for each` loop 
// specific for accessing elements of array 
// whithout their index 

public class Main {
    public static void main(String[] args) {
        
        // Test arr 
        String[] movies = {"Fight Club", "Jason Bourne", "The Dark Knight", "Interstellar", 
                            "Cap America: Civil War", "Avengers 2", "Hangover 1"};
        
        System.out.println("Movies: ");
        int counter = 1;
        // Example of `for each` loop 
        for (String movie: movies) {
            System.out.println(counter + ". " + movie);
            ++counter;
        }
        
    }
}
