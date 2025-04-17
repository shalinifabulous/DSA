import java.util.Scanner;

public class LeapYear {
    public static char leapYear(int year){
        if(year % 4 == 0 && year % 400 == 0 || year % 100 != 0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not leap year");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(LeapYear.leapYear(year));
    }
}
