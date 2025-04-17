import java.util.Scanner;
public class Prime {
    public void check(int num){
        if(isPrime(num)){
            System.out.println(num + " is prime");
        }
        else{
            System.out.println(num + " isn't prime");
        }
    }
    public boolean isPrime(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num =sc.nextInt();
        Prime prime = new Prime();
        System.out.println(prime.isPrime(num));
    }
}
