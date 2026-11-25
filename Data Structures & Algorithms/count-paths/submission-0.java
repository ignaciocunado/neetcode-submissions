class Solution {
    public int uniquePaths(int m, int n) {
        int[][] mem = new int[m][n];

        for(int j = 0; j < n; j++) {
            for(int i = 0; i < m; i++) {
                if (i == 0 && j == 0) {
                    mem[i][j] = 1;
                    continue;
                }
                int prev1 = 0;
                int prev2 = 0;
                if(j > 0) {
                    prev1 = mem[i][j - 1];
                }
                if(i > 0) {
                    prev2 = mem[i - 1][j];
                }

                mem[i][j] = prev1 + prev2;
            }
        }

        return mem[m - 1][n - 1];
    }
}
