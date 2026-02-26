package week01;

public class avarage {
    static void main() {
        int numbers[] = {4, 8, 15, 16, 23, 42};

        float avg, sum = 0;

        int length = numbers.length;

        for (int num : numbers) {
            sum += num;
        }

        avg = sum / length;

        System.out.println("The average is: " + avg);
    }
}
