class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n < 2) {
            return nums[0];
        }

        int[] mem = new int[n];
        mem[0] = nums[0];
        mem[1] = Math.max(nums[1], nums[0]);

        for(int i = 2; i < n; i++) {
            mem[i] = Math.max(nums[i] + mem[i - 2], mem[i - 1]);
        }

        return mem[n - 1];
    }
}
