public class Solution {
		public boolean checkRecord(String s) {
		    boolean isContinuous = false;
		    HashMap<String, Integer> map = new HashMap();
			for(int i = 0; i < s.length(); i++) {
			    char c = s.charAt(i);
				String str = String.valueOf(c);
				if (str.equals("A") || str.equals("L")) {
					map.put(str, 1 + (map.get(str) == null ? 0 : map.get(str)));
					if (i >= 2 && c == 'L' && s.charAt(i-1) == 'L' && s.charAt(i-2) == 'L') {
					    isContinuous = true;
					}
				}
			}

			int aCount = map.get("A") == null ? 0 : map.get("A");
			int lCount = map.get("L") == null ? 0 : map.get("L");
			
			return aCount < 2 && (lCount < 3 || !isContinuous);
		}
}