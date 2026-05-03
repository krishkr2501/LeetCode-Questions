class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;

        if (rows * cols != r * c) return mat;

        int[][] ans = new int[r][c];
        Stack<Integer> st = new Stack<>();

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                st.push(mat[i][j]);
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = st.pop();
            }
        }

        return ans;
    }
}
