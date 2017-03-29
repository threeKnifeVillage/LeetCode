public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        boolean isFound = false;
        
        for(int i = 0; i < numbers.length && !isFound; i++) {
            int num = target - numbers[i];
            
            int resultNum = binarySearch(numbers, num, i+1);
            if (resultNum > 0) {
                    result[0] = i+1;
                    result[1] = resultNum+1;
                    isFound = true;
                    
                    break;
            }
        }
        
        return result;
    }
    
    public int binarySearch(int[] numbers, int num, int start) {
        int end = numbers.length - 1;
        int mid = 0;
        
        while(start <= end) {
            mid = (start + end) / 2;
            if (numbers[mid] < num) {
                start = mid + 1;
            } else if (numbers[mid] > num) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        
        return 0;
    }
}