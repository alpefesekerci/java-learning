package week01;

import java.util.Scanner;

public class fiveStudents {
    static void main() {
        int[] notlar = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Lutfen 5 öğrencinin notlarini giriniz:");


        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". ogrencinin notu: ");
            notlar[i] = sc.nextInt();
        }

        System.out.println("Ogrenci Not Listesi: ");

        for (int not : notlar) System.out.print(not + " ");
        System.out.println();
    }
}
