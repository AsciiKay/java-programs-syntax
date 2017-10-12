// Math operators
// + : addition
// - : subtraction
// * : multiplication
// / : division
// % : modulo
// 
// For both ints and doubles
//
// Increment-Decrement
// ++ : incrementation
// -- : decrementation
//
// Assignment operators
// += : variable's value + given value assigned to variable
// -= : same for subtraction
// *= : same for multiplication
// /= : same for division
// %= : same for modulus

class Main {
    public static void main(String[] args) {
        int sum = 9 + 9;
        ++sum;
        sum += 0;
        double subs = 98.314159 - 0.314159;
        --subs;
        int mult = 89 * 89;
        mult *= 2;
        double div = 11 / 3;
        int mod = 17 % 5;
        mod /= 3;
        
        System.out.println("9 + 9 + 1 = " + sum);
        System.out.println("98.314159 - 0.314159 = " + subs);
        System.out.println("89 * 89 * 2 = " + mult);
        System.out.println("11 / 3 = " + div);
        System.out.println("17 % 5 % 3 = " + mod);
    }
}
