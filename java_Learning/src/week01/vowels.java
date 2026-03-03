package week01;

import java.util.Scanner;

public class vowels {
    static void main() {
        Scanner scan = new Scanner(System.in);
        boolean donguDevamEtsin = true;

        while (donguDevamEtsin) {
            System.out.println("Sesli Harf Giriniz:");
            char harf = scan.next().charAt(0);

            switch (harf) {
                case 'A': case 'a':
                case 'I': case 'ı':
                case 'O': case 'o':
                case 'U': case 'u':
                    System.out.println(harf + " " + "Kalın Sesli harftir.");
                    donguDevamEtsin = false;
                    break;

                case 'E': case 'e':
                case 'İ': case 'i':
                case 'Ö': case 'ö':
                case 'Ü': case 'ü':
                    System.out.println(harf + " " + "İnce Sesli harftir.");
                    donguDevamEtsin = false;
                    break;

                default:
                    System.out.println(harf + " " + "Sesli Harf Değildir. \nLütfen Geçerli Bir Harf Giriniz.");


            }

        }

    }
}
