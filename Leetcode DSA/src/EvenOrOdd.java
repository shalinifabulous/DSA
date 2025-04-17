import java.util.Scanner;
public class EvenOrOdd {
    public static void even(int num){
        if(num > 0){
            System.out.println("Positive number");
        }
        else{
            System.out.println("Negative number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        EvenOrOdd.even(number);
    }


}
