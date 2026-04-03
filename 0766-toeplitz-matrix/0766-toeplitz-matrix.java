class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int ro = 1;
        while(ro<matrix.length){
            int co = 1;
            while(co<matrix[ro].length){
                if(matrix[ro][co] != matrix[ro-1][co-1]){
                    return false;
                }
                co++;
            }
            ro++;
        }
        return true;
    }
}