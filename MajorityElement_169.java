public class Solution {
    public int majorityElement(int[] nums) {
        long count = Math.round((nums.length / 2));
        Map<Integer, Integer> majorityElementMap = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer appearCount = majorityElementMap.get(num);
            if (appearCount == null) {
                appearCount = 0;
            }
            
            majorityElementMap.put(num, appearCount + 1);
            if (appearCount + 1 > count) {
                return num;
            }
        }
        
        return 0;
    }
}
