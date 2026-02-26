package week01;

public class factorialRecursion {
    static int factorial (int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    static void main() {
        System.out.println("Factorial of 5 is " + factorial(5));
    }

    }

