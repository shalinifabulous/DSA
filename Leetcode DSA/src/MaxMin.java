import java.util.Scanner;
import java.util.Arrays; // Needed to print array nicely

public class MaxMin {
    public static int[] maxmin(int num){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = Math.abs(num); // in case num is negative

        while(n != 0){
            int dig = n % 10;
            if(dig > max){
                max = dig;
            }
            if(dig < min){
                min = dig;
            }
            n /= 10;
        }

        int[] ans = new int[2];
        ans[0] = max;
        ans[1] = min;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] result = MaxMin.maxmin(num);
        System.out.println("Maximum digit: " + result[0]);
        System.out.println("Minimum digit: " + result[1]);
    }
}
