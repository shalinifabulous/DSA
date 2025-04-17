public class CeilingChar {
    public static char ceilChar(char[] arr, char target){
        int N = arr.length;
        int start = 0;
        int end = N;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }

        }
        return arr[start % N] ;
    }

    public static void main(String[] args) {
        char[] arr = {'c','d','f','j'};
        char target = 'j';
        System.out.println(CeilingChar.ceilChar(arr, target));
    }
}
