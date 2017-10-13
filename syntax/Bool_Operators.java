import java.util.Scanner;

// Boolean-Logical operators
// && : AND operator for checking two conditions at a time 
// || : OR op to check either of two conditions is true 
// !  : NOT op to convert false stmt to true and vice versa

public class Main {
    public static void main(String[] args) {
        
        int age = 15;
        boolean paid = true;
        
        if (age > 12 && paid) {
            System.out.println("You can enter the ghost house!\nBrace to get scared!");
        } else if (age > 12 && !(paid)) {
            System.out.println("You need to pay first.");
        } else if (age <= 12) {
            System.out.println("Huh! Try next year!");
        } else {
            System.out.println("If this occurs! There's something wrong with jvm or input!");
        }
        
    }
}

// && truth table 
// true && true -> true 
// false && false -> false  
// true && false, false && true -> false

// || truth table 
// true || true -> true 
// false ||true , true || false -> true 
// false || false -> false

// ! truth table 
// !(true) -> false 
// !(false) -> true 
