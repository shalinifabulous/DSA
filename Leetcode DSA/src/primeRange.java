import java.util.ArrayList;
import java.util.Scanner;

public class primeRange {
    public ArrayList<Integer> findPrimes(int start, int end) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        if (start < 2) start = 2; // Primes start from 2

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
        }
        return primeNumbers;
    }

    // Helper function to check if a number is prime
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i < num; i++) {  // Check only till sqrt(num)
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        primeRange pr = new primeRange();
        System.out.println("Prime numbers in range: " + pr.findPrimes(start, end));

        sc.close();
    }
}
