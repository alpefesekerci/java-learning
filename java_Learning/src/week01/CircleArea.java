package week01;

import java.util.Scanner;

public class CircleArea {
    public static void main(UpperLowerCase[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");

        int r = scan.nextInt();
        double alan = Math.PI * r * r;

        System.out.println("Dairenin Alanı : " + alan);


    }
}
