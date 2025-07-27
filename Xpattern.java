public class XPatternModified {
    public static void main(String[] args) {
        int rows = 5;

        // Top Half including Middle
        for (int i = 1; i <= rows; i++) {
            if (i == 1) {
                // First row: *     *
                System.out.print("*");
                for (int j = 1; j < rows; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            } else if (i == rows) {
                // Last row of top: one *
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("* ");
            } else {
                // Middle rows
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("* ");
                for (int j = 1; j < rows - (i * 1); j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        // Bottom half (inverted V)
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j <= rows - (i + 1); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= rows - (rows - i); j++) {
                System.out.print("  ");
            }
            System.out.println("* ");
        }
    }
}
