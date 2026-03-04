package week01;

import java.util.Scanner;

public class FindingNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bulmak istediğiniz sayıyı giriniz:");
        int targetNumber = scan.nextInt();
        int[] numbers = new int[] {1,2,5,7,9,0};
        boolean isThere = false;

        for (int number : numbers){
            if (number == targetNumber){
                isThere = true;
                break;
            }
        }
        if (isThere){
            System.out.println("Sayı mevcuttur.");
        }else{
            System.out.println("Sayı mevcut değildir.");
        }

    }
}
