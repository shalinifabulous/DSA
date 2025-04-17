import java.util.Scanner;
public class Maximum2 {
    public static int Max(int n1, int n2){
        int max = Integer.MIN_VALUE;
        if(n1 > max && n1 > n2){
            max = n1;
        }
        else if(n2 > max && n2 > n1){
            max = n2;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(Maximum2.Max(n1, n2));
    }
}
