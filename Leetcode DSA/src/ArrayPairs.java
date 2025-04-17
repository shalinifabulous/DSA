public class ArrayPairs {
    static boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        for( int start = 0; start <= n / 2 - 1; start++ ){
            for( int end = n - 1; end >= n / 2; end --){
                if((arr[start] + arr[end]) % k == 0){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3,8,17,2,5,6};
        int k = 10;
        System.out.println(canArrange(arr, k));
    }
}
