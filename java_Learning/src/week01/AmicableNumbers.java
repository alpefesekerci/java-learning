package week01;

import java.util.Scanner;

public class AmicableNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Sayıyı Giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.println("2. Sayıyı Giriniz: ");
        int sayi2 = scan.nextInt();
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                // toplam1 = toplam1 + i;
                toplam1 += i;
            }
        }

        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                // toplam2 = toplam2 + i;
                toplam2 += i;
            }
        }

        if (sayi1 == toplam2 && sayi2 == toplam1) {
            System.out.println(sayi1 + " ve " + sayi2 + " arkadaştır.");
        } else {
            System.out.println(sayi1 + " ve " + sayi2 + " arkadaş değildir.");
        }
        scan.close();
    }
}
