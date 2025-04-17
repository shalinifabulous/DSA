import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr ={2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        int count = 1;
        for(int i = 1; i < n; i++){
            if(nums[i - 1] == nums[i]){
                count++;
            }
            if(count > n/2){
                return nums[i];
            }
        }
        return -1;
    }
}
