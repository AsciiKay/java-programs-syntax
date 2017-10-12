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

class Main {
    public static void main(String[] args) {
        int sum = 9 + 9;
        ++sum;
        double subs = 98.314159 - 0.314159;
        --subs;
        int mult = 89 * 89;
        double div = 11 / 3;
        int mod = 17 % 5;
        
        System.out.println("9 + 9 + 1 = " + sum);
        System.out.println("99.314159 - 0.314159 = " + subs);
        System.out.println("89 * 89 = " + mult);
        System.out.println("11 / 3 = " + div);
        System.out.println("17 % 5 = " + mod);
    }
}
