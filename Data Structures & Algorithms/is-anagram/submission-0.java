class Solution {
    public boolean isAnagram(String s, String t) {
        int[] total = new int[26];

        for (int i = 0; i< s.length();i++) {
            total[s.charAt(i) - 'a'] += 1;
        }

        for (int j=0; j<t.length(); j++) {
            total[t.charAt(j) - 'a'] -=1;
        }

        for (int k=0; k<26; k++) {
            if (total[k] != 0) return false;
        }
        return true;
    }
}
