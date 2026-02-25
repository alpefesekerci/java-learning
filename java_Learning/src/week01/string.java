package week01;

public class string {
    static void main() {
        String txt = "Hello World";
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("e")); /*Java counts positions from zero.
        0 is the first position in a string, 1 is the second, 2 is the third ...*/
    }
}
