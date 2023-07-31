class Solution {
    public boolean exist(char[][] board, String word) {

        // edge case: if the board is empty, return false
        if (board.length == 0) {
            return false;
        }

        // edge case: if the word is empty, return true
        if (word.length() == 0) {
            return true;
        }

        // create a boolean 2D array to keep track of visited cells
        boolean[][] visited = new boolean[board.length][board[0].length];

        // loop through the board to find the first letter of the word
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    // if the first letter is found, call the search helper function
                    if (search(board, i, j, word, 0, visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean search(char[][] board, int i, int j, String word, int index, boolean[][] visited) {

        // base case: if we have reached the end of the word, return true
        if (index == word.length()) {
            return true;
        }

        // base case: if we have gone out of bounds or the current cell is not equal to the next letter in the word, return false
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index) || visited[i][j]) {
            return false;
        }

        // mark the current cell as visited
        visited[i][j] = true;

        // check all the adjacent cells for the next letter in the word
        boolean result = search(board, i + 1, j, word, index + 1, visited) || search(board, i - 1, j, word, index + 1, visited) || search(board, i, j + 1, word, index + 1, visited) || search(board, i, j - 1, word, index + 1, visited);

        // mark the current cell as unvisited
        visited[i][j] = false;

        return result;
    }
}
