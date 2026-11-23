class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int rowLow = 0, rowHigh = n - 1, colLow = 0, colHigh = m - 1;

        while(rowLow <= rowHigh) {
            int rowMid = rowLow + (rowHigh - rowLow) / 2;
            
            if(target == matrix[rowMid][0] || target == matrix[rowMid][m - 1]) {
                return true;
            }

            if(target >= matrix[rowMid][0] && target <= matrix[rowMid][m - 1]) {
                return binarySearch(matrix[rowMid], target);
            }
            
            if(target < matrix[rowMid][0]) {
                rowHigh = rowMid - 1;
            }
            else if(target > matrix[rowMid][m - 1]) {
                rowLow = rowMid + 1;
            }
        }
        return false;    
    }

    private boolean binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {
                return true;
            }
            else if(arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        
        return false;
    }
}
