import java.util.Arrays;

public class Solution {
    
	public static int singleNumber(int[] nums) {
		
		if (nums == null || nums.length == 0)
		{
			return 0;
		}
		
		Arrays.sort(nums);
		
		int len = nums.length;
		
		if (len == 1 || nums[0] != nums[1])
		{
			return nums[0];
		}
		
		if (nums[len - 1] != nums[len - 2])
		{
			return nums[len - 1];
		}
		
		for (int i = 1; i < len - 1; i++)
		{
			if (nums[i] == nums[i+1] || nums[i] == nums[i-1])
			{
				continue;
			}
			
			return nums[i];
		}
		
		return 0;
    }

	public static void main(String[] args) {
		int[] nums = {3,1,1,4,3,4,2};
		System.out.print(singleNumber(nums));
	}
}
