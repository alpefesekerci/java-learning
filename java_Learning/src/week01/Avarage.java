package week01;

import java.util.Scanner;

public class Avarage {
    public static void main(UpperLowerCase[] args) {
        Scanner scan = new Scanner(System.in);

        double total = 0;
        int sum;

        while (true) {
            System.out.println("Kaç adet sayının ortalamasını almak istiyorsunuz? ");
            sum = scan.nextInt();

            if (sum > 0) {
                break;
            } else {
                System.out.println("En az bir sayı girmelisiniz!");
            }
        }

            for (int i = 1; i <= sum; i++) {
                System.out.println(i + ". sayıyı girin:");
                double number = scan.nextDouble();
                total += number;
            }

            double ortalama = total / sum;
            System.out.println("Girdiğiniz sayıların ortalaması: " + ortalama);

        }
    }
