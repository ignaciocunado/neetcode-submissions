class Solution {
    public boolean isPalindrome(String s) {
        String newString = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0, right = newString.length() - 1;
        while(left < right) {
            if(newString.charAt(left++) != newString.charAt(right--)) {
                return false;
            }
        }

        return true;
    }
}
