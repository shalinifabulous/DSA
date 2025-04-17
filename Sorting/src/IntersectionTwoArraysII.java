import java.util.*;

class IntersectionTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        List<Integer> resultList = new ArrayList<>();
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                resultList.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] result = new int[resultList.size()];
        int index = 0;
        for(int num : resultList){
            result[index++] = num;
        }
        return result;
    }

        public int[] intersectII(int[] nums1, int[] nums2) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int num : nums1){
                map.put(num, map.getOrDefault(num,0)+1);
            }
            List<Integer> resultList = new ArrayList<>();
            for(int num : nums2){
                if(map.getOrDefault(num,0) > 0){
                    resultList.add(num);
                    map.put(num, map.get(num) - 1);
                }
            }
            int[] result = new int[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                result[i] = resultList.get(i);
            }

            return result;
        }
    }
