class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] total = new int[26];

        for (int i = 0; i< s.length();i++) {
            total[s.charAt(i) - 'a'] += 1;
            total[t.charAt(i) - 'a'] -=1;

        }

        for (int value : total) {
            if (value != 0) return false;
        }
        return true;
    }
}
