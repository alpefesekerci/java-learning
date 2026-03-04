package week01;

import java.util.Scanner;

public class FiveStudents {
    public static void main(String[] args) {
        int[] notlar = new int[5];
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 5 öğrencinin notlarini giriniz:");


        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". ogrencinin notu: ");
            notlar[i] = scan.nextInt();
        }

        System.out.println("Ogrenci Not Listesi: ");

        for (int not : notlar) System.out.print(not + " ");
        System.out.println();
    }
}
