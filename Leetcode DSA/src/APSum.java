import java.util.Scanner;
import java.util.Scanner;

public class APSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size as input
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Taking array elements as input
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Start and end values
        int start = nums[0];
        int end = nums[n - 1];

        // Sum using the formula for arithmetic sum
        int sums = (n * (start + end)) / 2;

        // Display the result
        System.out.println("Sum of the arithmetic sequence: " + sums);

        sc.close(); // Close scanner
    }
}
