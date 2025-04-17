import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1};
        sortArray(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static int[] sortArray(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }



}

