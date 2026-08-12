class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++) {
            char[] current = strs[i].toCharArray();
            Arrays.sort(current);
            String sorted = new String(current);

            if (map.containsKey(sorted)) {
                List<String> value = map.get(sorted);
                value.add(strs[i]);
                map.put(sorted, value);
            } else {
                map.put(sorted, new ArrayList<>(Arrays.asList(strs[i])));
            }
        }

        return new ArrayList<>(map.values());
    }
}
