package week01;

public class highestNote {
    static void main() {
        int[] notes = {10, 90, 80, 70, 60, 50, 45, 95};
        int highestNote = notes[0];

        for (int note : notes){
            if (highestNote < note){
                highestNote = note;
            }
        }

        System.out.println("The highest note is: " + highestNote);

    }
}
