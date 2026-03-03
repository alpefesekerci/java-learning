package week01;

import java.util.Scanner;

public class vowels {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Sesli Harf Giriniz:");
        char harf = scan.next().charAt(0);

        switch (harf) {
            case 'A': case 'a' :
            case 'I': case 'ı' :
            case 'O': case 'o' :
            case 'U': case 'u' :
                System.out.println(harf + " " + "Kalın Sesli harftir.");
                break;
            default:
                System.out.println(harf + " " + "İnce Sesli harftir.");


        }

    }

}
