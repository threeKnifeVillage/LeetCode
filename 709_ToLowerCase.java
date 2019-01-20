class Solution {
    public String toLowerCase(String str) {
        if (str == null) {
            return null;
        }
        
        char[] newValue = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                newValue[i] = (char)((int)ch + ('a' - 'A'));
            } else {
                newValue[i] = ch;
            }
        }
        
        return newValue != null ? new String(newValue) : null;
    }
}