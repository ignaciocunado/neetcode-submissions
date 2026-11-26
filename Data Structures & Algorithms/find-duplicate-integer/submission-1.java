class Solution {
    public int findDuplicate(int[] nums) {
        for (int num : nums) {
            int idx = Math.abs(num) - 1;
            if (nums[idx] < 0) {
                return Math.abs(num);
            }
            nums[idx] *= -1;
        }
        return -1;
    }

    // Trivial
    // public int findDuplicate(int[] nums) {
    //     Set<Integer> s = new HashSet<>();

    //     for(int i : nums) {
    //         if(s.contains(i)) {
    //             return i;
    //         }

    //         s.add(i);
    //     }

    //     return 0;
    // }
}
