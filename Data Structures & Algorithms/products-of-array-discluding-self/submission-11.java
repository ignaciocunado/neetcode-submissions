class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] right = new int[nums.length];
        int[] left = new int[nums.length];

        right[0] = 1;
        left[nums.length - 1] = 1;

        int mult = 1;
        for(int i = 1; i < nums.length; i++) {
            mult *= nums[i - 1];
            right[i] = mult;
        }
        mult = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            mult *= nums[i + 1];
            left[i] = mult;
        }

        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            res[i] = right[i] * left[i];
        }

        return res;
    }
}  
