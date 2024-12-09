class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // Pointer for string s
        int j = 0; // Pointer for string t
        
        while (i < s.length() && j < t.length()) {
            // If characters match, move pointer i for s
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            // Always move pointer j for t
            j++;
        }
        
        // If we've matched all characters in s, return true
        return i == s.length();
    }
}
