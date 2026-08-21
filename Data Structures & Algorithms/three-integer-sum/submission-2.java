class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;


        Set<List<Integer>> res = new HashSet<>();

        for (int i=0; i < nums.length; i++) {
            int current = nums[i];

            low = i + 1;
            high = nums.length - 1;

            while (low < high) {
                if (nums[low] + nums[high] == -current) {
                    res.add(List.of(current, nums[low], nums[high]));
                    low++;
                    high--;
                } else if (nums[low] + nums[high] > -current) {
                    high--;
                } else {
                    low ++;
                }
            }
        }

        return new ArrayList<>(res);
    }
}
