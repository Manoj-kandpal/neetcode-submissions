class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++) {
            char[] current = strs[i].toCharArray();
            Arrays.sort(current);
            String sorted = new String(current);

            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}
