import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create a List to store the input
        List<Integer> arrList = new ArrayList<>();

        // Input the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arrList.add(scanner.nextInt());
        }

        // Convert List<Integer> to int[]
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = arrList.get(i);
        }

        // Call the insertionSort1 method
        Result.insertionSort1(n, arr);

        scanner.close();  // Close the scanner
    }
}

class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, int[] arr) {
        // Store the value to be inserted
        int value = arr[n - 1];
        int i = n - 2;

        // Shift elements of arr that are greater than value to one position ahead
        while (i >= 0 && arr[i] > value) {
            arr[i + 1] = arr[i];
            i--;

            // Print the array after each shift
            printArray(arr);
        }

        // Insert the value at the correct position
        arr[i + 1] = value;

        // Print the final array after insertion
        printArray(arr);
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
}
