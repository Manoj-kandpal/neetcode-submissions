class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            map.merge(num, 1, Integer::sum);
        }

        List<List<Integer>> list = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            list.add(List.of(entry.getKey(), entry.getValue()));
        }

        list.sort((a,b) -> Integer.compare(b.get(1), a.get(1)));

        return list.subList(0, k).stream().mapToInt(item -> item.get(0)).toArray();
    }
}
