class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while(left < right && numbers[left] + numbers[right] != target) {
            if(numbers[left] + numbers[right] < target) {
                left++;
            }
            else {
                right--;
            }
        }


        return new int[]{left + 1, right + 1};
    }
}
