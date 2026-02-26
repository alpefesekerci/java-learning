package week01;

import java.util.Scanner;

public class examGrade {
    static void main() {
        System.out.print("Notunuzu giriniz : ");
        int not = new Scanner(System.in).nextInt();
        if( not <= 100 && not >= 90 ) {
            System.out.println("AA");
        } else if ( not < 90 && not >= 85 ) {
            System.out.println("BA");
        } else if ( not < 85 && not >= 80 ) {
            System.out.println("BB");
        } else if ( not < 80 && not >= 70 ) {
            System.out.println("CB");
        } else if ( not < 70 && not >= 60 ) {
            System.out.println("CC");
        } else if ( not < 60 && not >= 50 ) {
            System.out.println("DC");
        } else if ( not < 50 && not >= 45 ) {
            System.out.println("DD");
        } else if ( not < 45 && not >= 0 ) {
            System.out.println("FF");
        } else {
            System.out.println("Lütfen Geçerli Bir Not Giriniz.");

        }

    }
}
