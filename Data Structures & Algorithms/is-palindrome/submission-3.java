class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int h = s.length() - 1;
        String pattern = "[a-zA-Z0-9]";

        while (i < h) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } else if(!Character.isLetterOrDigit(s.charAt(h))) {
                h--;
            } else if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(h))) {
                return false;
            } else {
                i++;
                h--;
            }
        }
        return true;
    }
}
