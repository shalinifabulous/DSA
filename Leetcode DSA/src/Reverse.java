import java.util.Scanner;

public class Reverse {
    public static int reverse(int x) {
        int rev = 0;


        while( x != 0){
            int dig = x % 10;
            if (rev > (Integer.MAX_VALUE - dig)/ 10 ){
                return 0;  // Overflow condition for positive numbers
            }
            if (rev < (Integer.MIN_VALUE )/ 10){
                return 0;  // Overflow condition for negative numbers
            }
            rev = rev * 10 + dig;
            x = x / 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = reverse(x);
        System.out.println(result);
    }
}
