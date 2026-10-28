class Solution {
    public boolean isValidSudoku(char[][] board) {
        return columnsValid(board) && rowsValid(board) && squaresValid(board);
    }

    private boolean columnsValid(char[][] b) {
        // Check duplicates in cols
        for(int i = 0; i < b.length; i++) {
            Set<Character> s = new HashSet<>();
            for(int j = 0; j < b.length; j++) {
                if(b[j][i] == '.') {
                    continue;
                }
                if(s.contains(b[j][i])) {
                    return false;
                }

                s.add(b[j][i]);
            }
        }

        return true;
    }

    private boolean rowsValid(char[][] b) {
        // Check duplicates in rows
        for(int i = 0; i < b.length; i++) {
            Set<Character> s = new HashSet<>();
            for(int j = 0; j < b.length; j++) {
                if(b[i][j] == '.') {
                    continue;
                }
                if(s.contains(b[i][j])) {
                    return false;
                }

                s.add(b[i][j]);
            }
        }

        return true;
    }

    private boolean squaresValid(char[][] b) {
    for (int boxRow = 0; boxRow < 9; boxRow += 3) {
        for (int boxCol = 0; boxCol < 9; boxCol += 3) {
            Set<Character> s = new HashSet<>();
            for (int i = boxRow; i < boxRow + 3; i++) {
                for (int j = boxCol; j < boxCol + 3; j++) {
                    if (b[i][j] == '.') {
                        continue;
                    }
                    if (!s.add(b[i][j])) {
                        return false;
                    }
                }
            }
        }
    }
    return true;
}
}
