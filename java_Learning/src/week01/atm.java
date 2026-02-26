package week01;

import java.util.Scanner;

public class atm {
    static void main() {
        Scanner scan = new Scanner(System.in);

        int bakiye = 9999;
        int islem;

        System.out.println("""
                Lütfen Yapmak İstediğiniz işlemi Seçiniz :
                1 - Para Çekme
                2 - Para Yatırma
                3 - Bakiye Görüntüleme
                4 - Kart iade""");

        islem = scan.nextInt();

        switch(islem) {
            case 1 :
                System.out.println("Çekilecek Tutarı Giriniz:");
                int miktarC = scan.nextInt();
                bakiye = bakiye - miktarC;
                System.out.println("Yeni Bakiye : " + bakiye + " tl ");
                break;
            case 2 :
                System.out.println("Yatıralacak Tutarı Giriniz:");
                int miktarY = scan.nextInt();
                bakiye = bakiye + miktarY;
                System.out.println("Yeni Bakiye : " + bakiye + " tl ");
                break;
            case 3 :
                System.out.println("Bakiye : " + bakiye + " tl ");
                break;
            case 4 :
                System.out.println("Kartınızı almayı unutmayınız.");
                break;
            default :
                System.out.println("Lütfen Geçerli Bir İşlem Seçiniz.");

        }


    }
}
