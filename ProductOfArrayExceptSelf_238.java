public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        boolean isAllZero = true;
        int zeroNum = 0;
        
        int[] output = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                product *= nums[i];
                isAllZero = false;
            } else {
                zeroNum++;
            }
            
        }
        
        if (isAllZero) {
            product = 0;
        }
        
        for(int i = 0; i < nums.length; i++) {
            if (zeroNum > 1) {
                output[i] = 0;
                continue;
            }
            
            if (!isAllZero) {
                if (nums[i] != 0) {
                    if (zeroNum != 0) {
                        output[i] = 0;
                    } else {
                        output[i] = product / nums[i];
                    }
                } else {
                    output[i] = product;
                }
            } else {
                output[i] = 0;
            }
            
        }
        
        return output;
    }
}