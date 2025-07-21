// File: HourglassPattern.java
public class HourglassPattern {
    public static void main(String[] args) {
        int rows = 5;
        int space = 8;
        int upper = 2;

        // Upper Part of Hourglass
        for (int i = 1; i <= rows; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Middle space
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            space -= 2;
            System.out.println();
        }

        // Lower Part of Hourglass
        for (int i = 1; i < rows; i++) {
            // Left stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("* ");
            }
            // Middle space
            for (int j = 1; j <= upper; j++) {
                System.out.print("  ");
            }
            // Right stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("* ");
            }
            upper += 2;
            System.out.println();
        }
    }
}
