import java.util.Scanner;
public class PerfectSum {
    public char check(int num){
        if(isPerfect(num)){
            System.out.println(num + " is Perfect number");
        }
        else{
            System.out.println(num + " is not Perfect number");
        }
        return 0;
    }
    public boolean isPerfect(int num){
        int n = num;
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        if(sum == num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        PerfectSum perfect = new PerfectSum();
        System.out.println(perfect.check(number));
    }
}
