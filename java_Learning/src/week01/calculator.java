package week01;

import java.util.Scanner;

public class calculator {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        int sayi2 = scan.nextInt();

        System.out.println("İşlem Seçiniz 1:Toplama 2:Çıkarma 3:Çarpma 4:Bölme : ");
        int tercih = scan.nextInt();

        if (tercih == 1) {
            System.out.println("Sonuç : " + (sayi1 + sayi2));
        } else if (tercih == 2) {
            System.out.println("Sonuç : " + (sayi1 - sayi2));
        } else if (tercih == 3) {
            System.out.println("Sonuç : " + (sayi1 * sayi2));
        } else if (tercih == 4) {
            if (sayi2 == 0) {
                System.out.println("Bölen Sayı SIFIR Olamaz ! ");
            } else {
                System.out.println("Sonuç : " + (sayi1 / sayi2));

            }

        }

    }

}





