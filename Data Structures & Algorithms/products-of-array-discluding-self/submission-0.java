class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mulFromLeft = 1;
        int mulFromRight = 1;

        int[] res = new int[nums.length];

        for (int i=0; i<nums.length; i++) {
            res[i] = 1;
        }

        for (int i=0; i<nums.length; i++) {
            res[i] *= mulFromLeft;
            res[nums.length - i - 1] *= mulFromRight;
            mulFromLeft *= nums[i];
            mulFromRight *= nums[nums.length - i - 1];
        }

        return res;
    }
}  
