import java.util.Arrays;

class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        Integer thirdMax = null;
        Integer firstMax = null;

        for(int i = nums.length - 1; i >= 0; i--){
            if(i < nums.length - 1 && nums[i] == nums[i + 1]){
                continue;
            }
            count++;

            if(count == 3){
                thirdMax = nums[i];
            }
        }
        if(thirdMax != null){
            return thirdMax;
        }
        return nums[nums.length - 1];
    }
}