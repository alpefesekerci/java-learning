package week01;

public class primeNumbersV2 {
    static void main() {
        int number = 3;
        boolean isPrime = true;

        if (number == 1){
            System.out.println("1 Asal değildir");
            return;
        }

        if (number<1){
            System.out.println("Geçersiz sayı");
            return;
        }

        for (int i = 2; i<number; i++ ){
            if (number % i == 0){
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println("Sayı asaldır");
        }else{
            System.out.println("Sayı asal değildir");
        }
    }
}
