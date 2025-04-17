import java.util.Scanner;
public class OneDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
}
