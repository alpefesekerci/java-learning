package week01;

import java.util.Scanner;

public class primeNumbers {
    static void main() {
        System.out.print("Sayıyı giriniz : ");
        int sayi = new Scanner(System.in).nextInt();
        boolean hesaplama = true;
        for (int i=2; i < sayi; i++)
        {
            if (sayi % i == 0)
            {
                hesaplama = false;
                break;
            }
        }
        if (hesaplama){
            System.out.println(sayi + " " + "Asal Sayıdır.");
        }
        else{
            System.out.println(sayi + " " + "Asal Sayı Değildir.");
        }

    }
}
