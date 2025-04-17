import java.util.Scanner;

public class Ceiling {
    public static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            }

            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];
    }

    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        int[] arr = new int[25];
       for(int i = 0; i < 25; i++){
           arr[i] = sc.nextInt();
       }
       int target = sc.nextInt(); */
        int[] arr = {2, 3, 5, 9, 14, 16, 17, 18};
        int target = 15;
        System.out.println(Ceiling.ceiling(arr, target));
    }
}
