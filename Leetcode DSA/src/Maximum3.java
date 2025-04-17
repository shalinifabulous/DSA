import java.util.Scanner;

public class Maximum3 {
    public static int Max(int a, int b, int c){
        int max = Integer.MIN_VALUE;
        if(a > b && a > c){
            max = a;
        }
        else if(b > c && b > a){
            max = b;
        }
        else{
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(Maximum3.Max(num1, num2, num3));
    }
}
