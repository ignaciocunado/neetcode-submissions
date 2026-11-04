class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {
            int target = -nums[i];

            int j = i + 1;
            int k = nums.length - 1;

            while(j < k && j < nums.length && k > i) {
                int currentSum = nums[j] + nums[k];

                if(currentSum == target) {
                    res.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                else if(currentSum < target) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }

        return new ArrayList<>(res);
    }
}
