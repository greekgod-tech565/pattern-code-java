import java.util.Scanner;

public class RootEvenOddCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 2: Find square root and store as double
        double root = Math.sqrt(num);

        // Step 3: Check if root is a perfect square or not
        // (int)root means decimal ke baad sab truncate ho jaata hai
        if (root == (int)root) {
            System.out.println("Perfect root");
        } else {
            System.out.println("Not a perfect root");
        }

        // Step 4: Even or Odd check
        if (num % 2 == 0) {
            System.out.println("Number is even, so double: " + (num * 2));
        } else {
            System.out.println("Number is odd, so triple: " + (num * 3));
        }

        // Step 5: Compare with 10
        if (num > 10) {
            System.out.println("Number is greater than 10. Difference: " + (num - 10));
        } else {
            System.out.println("Number is less than or equal to 10. Difference: " + (10 - num));
        }

        // Step 6: Extra Demo – Type casting trick explanation
        double x = 9.999;
        int y = (int)x;

        System.out.println("x == y: " + (x == y));           // false
        System.out.println("(int)x == 9: " + ((int)x == 9)); // true
        System.out.println("(int)x == 10: " + ((int)x == 10)); // false
    }
}
