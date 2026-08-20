class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int maximum = 0;

        int count =0;

        int i=0;
        int start = 0;
        int low = 0;

        while (i < s.length()) {
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= low) {
                low = map.get(s.charAt(i)) + 1; 
            }
            maximum = Math.max(maximum, i - low + 1);
            map.put(s.charAt(i), i);
            i++;
        }

        return maximum;
    }
}
