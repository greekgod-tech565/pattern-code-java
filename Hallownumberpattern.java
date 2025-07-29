public class HollowNumberPattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i<=rows; i++) {
            if (i == 1) {
                System.out.print(i+" ");
            } else if (i == rows) {
                for (int j = 1; j <= rows; j++) {
                    System.out.print(j+" ");
                }
            } else {
                System.out.print("1 ");
                for (int j = 1; j <2 * i - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
