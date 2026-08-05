class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int h = s.length() - 1;

        while (i < h) {
            if (!String.valueOf(s.charAt(i)).matches("[a-zA-Z0-9]")) {
                i++;
                continue;
            } else if (!String.valueOf(s.charAt(h)).matches("[a-zA-Z0-9]")) {
                h--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(h))) return false;
            i++;
            h--;
        }
        return true;
    }
}
