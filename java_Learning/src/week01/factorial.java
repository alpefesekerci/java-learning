package week01;

import java.util.Scanner;


public class factorial {
    static void main() {
        Scanner scan = new Scanner(System.in);

        int number;
        int fact = 1;

        System.out.println("Hesaplamak istedeğiniz sayıyı giriniz: ");
        number = scan.nextInt();

        if (number < 0) {
            System.out.println("Hata: Negatif sayıların faktöriyeli hesaplanamaz!");
        } else {
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }

            System.out.println("Factorial of " + number + " is " + fact);
        }
    }
}
