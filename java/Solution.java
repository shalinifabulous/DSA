import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] Arr1 = a.toCharArray();
        char[] Arr2 = b.toCharArray();
        Arrays.sort(Arr1);
        Arrays.sort(Arr2);

        return Arrays.equals(Arr1, Arr2);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}