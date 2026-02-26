package week01;

public class evenNumbers {
    static void main() {
        for (int i = 0; i <= 100; i = i + 2) {
            if (i == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
