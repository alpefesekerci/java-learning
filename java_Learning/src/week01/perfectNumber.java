package week01;

import java.util.Scanner;

public class perfectNumber {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int number = 0;

        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.println("Lütfen pozitif bir tam sayı giriniz.");

            if (scan.hasNextInt()) {
                number = scan.nextInt();

                if (number > 0) {
                    isValidInput = true;
                } else {
                    System.out.println("Hata: Girdiğiniz sayı 0 veya negatif olamaz!");
                }
            } else {
                System.out.println("Hata: Lütfen sadece rakam kullanarak geçerli bir tamsayı giriniz!");
                scan.next();
            }
        }

        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;

            }
        }
        if (total == number) {
            System.out.println(number + " " + "Mükemmel sayıdır.");
        } else {
            System.out.println(number + " " + "Mükemmel sayı değildir.");
        }

        scan.close();
    }
}