class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = -1;
            }
        }
        return dp(grid,m,n,0,0,0,arr);
    }
    private int dp(int[][] grid,int m,int n,int i,int j,int sum,int[][] arr){
        if(i>=m || j>=n){
            return Integer.MAX_VALUE;
        }
        if(i==m-1 && j==n-1){
            return grid[i][j];
        }
        if(arr[i][j] != -1){
            return arr[i][j];
        }
        int a = dp(grid,m,n,i,j+1,sum,arr);
        int b = dp(grid,m,n,i+1,j,sum,arr);
        sum = Math.min(a,b) + grid[i][j];
        arr[i][j] = sum;
        return arr[i][j];
    }
}