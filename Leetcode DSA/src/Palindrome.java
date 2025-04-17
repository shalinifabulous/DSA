import java.util.ArrayList;
import java.util.Scanner;
public class Palindrome {
    public ArrayList<Integer> Range(int start, int end) {
        ArrayList<Integer> palindromes = new ArrayList<>();
        int num;
        for (num = start; num < end; num++) {
            int n = num;
            int rev = 0;
            while (n != 0) {
                int dig = n % 10;
                rev = rev * 10 + dig;
                n /= 10;
            }
            if (rev == num) {
                palindromes.add(num);
            }
        }
        return palindromes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start number");
        int start = sc.nextInt();
        System.out.println("Enter end number");
        int end = sc.nextInt();
        Palindrome pal = new Palindrome();
        System.out.println(pal.Range(start, end));
    }
}
