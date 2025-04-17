import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=num;
        int sum=0;
        while (n>0){
            int rem=n%10;
            sum+=rem;
            int div=n/10;
        }
        if (num==sum){
            System.out.println("Palindrome");
        }
        else
            System.out.println("not");
    }
}
