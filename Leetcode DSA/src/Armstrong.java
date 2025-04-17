import java.util.Scanner;
public class Armstrong {
    public char check(int num){
        if(isArmstrong(num)){
            System.out.println(num + " is an Armstrong number");
        }
        else{
            System.out.println(num + " is not an Armstrong number");
        }
        return 0;
    }
    public boolean isArmstrong(int num){
        int n = num;
        int sum = 0;
        while(n != 0){
            int dig = n % 10;
            sum = (int) (sum + Math.pow(dig,3));
            n /= 10;
        }
        if(sum == num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        Armstrong armstrong = new Armstrong();
        System.out.println(armstrong.check(number));
    }
}
