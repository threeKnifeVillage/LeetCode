
public class Solution {

	/**
	 * 通过两两相比确定公共前缀，2ms通过全部用例
	 * @param strs
	 * @return
	 */
	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
		{
			return "";
		}
		
		//只有一个字符串时，返回该字符串
		if (strs.length == 1)
		{
			return strs[0];
		}
		
		//相邻的两个字符串公共前缀
		String commonPrefix = "";
		
		//整个字符串数组的最长公共字符前缀
		String longestPrefix = commonPrefix(strs[0],strs[1]);
		
		//从第2个字符串开始两两比较
		for(int i = 1; i < strs.length - 1; i++)
		{
			commonPrefix = commonPrefix(strs[i],strs[i+1]);
			
			//相邻两个字符串没有公共字符，直接返回空
			if (commonPrefix.equals(""))
			{
				return "";
			}
			
			//相邻两个字符公共前缀和最长公共前缀相等，则继续遍历
			if (commonPrefix.equals(longestPrefix))
			{
				longestPrefix = commonPrefix;
				continue;
			}
			
			//相邻两个字符公共前缀和最长公共前缀完全不想等，返回空
			if (longestPrefix.length() == commonPrefix.length())
			{
				return "";
			}
			
			//相邻两个字符公共前缀和最长公共前缀部分不等，如相邻是“aaa”，公共是“a”
			if (longestPrefix.length() < commonPrefix.length())	
			{
				if (commonPrefix.startsWith(longestPrefix))
				{
					continue;
				}
				return "";
			}
			else
			{
				//相邻两个字符公共前缀和最长公共前缀部分不等，如相邻是“a”，公共是“aaa”
				if (longestPrefix.startsWith(commonPrefix))
				{
					longestPrefix = commonPrefix;
					continue;
				} 
				return "";
			}
		}

		return longestPrefix;
	}
	
	/**
	 * 相邻两个字符串求公共前缀
	 * @param str1
	 * @param str2
	 * @return 公共字符串
	 */
	private static String commonPrefix(String str1,String str2)
	{
		int len = str1.length() <= str2.length() ? str1.length() : str2.length();
		int i;
		for(i = 0;i < len; i++)
		{
			if (str1.charAt(i) != str2.charAt(i))
			{
				break;
			}
		}
		
		if (i != 0)
		{
			return str1.substring(0, i);
		}
		
		return "";
	}
	
	public static void main(String[] args) {
		String[] strs = {"abd","acfn","abdggg"};
		System.out.println(longestCommonPrefix(strs));
	}
}
