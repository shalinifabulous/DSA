import java.util.Arrays;
import java.util.Scanner;
public class Minimum_Increment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        int temp;
        System.out.println("Enter");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Sorted");
        for (int i=0;i<n;i++){
            Arrays.sort(arr);
            }
        System.out.println(Arrays.toString(arr));
        System.out.println("Incremented");
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] >= arr[i+1]) {
                arr[i+1] = arr[i] + 1;
            }
            System.out.println(arr[i]);
        }

        System.out.println(arr[n-1]);

    }
    }

