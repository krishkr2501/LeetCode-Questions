class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(arr[i], -1);   
        }
        return dp(obstacleGrid,0,0,m,n,0,arr);
    }
    private int dp(int[][] grid, int i,int j,int m,int n,int sum,int[][] arr){
        if(i>=m || j>=n){
            return 0;
        }
        if(grid[i][j]==1){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(arr[i][j] != -1){
            return arr[i][j];
        }
        int a = dp(grid,i,j+1,m,n,sum,arr);
        int b = dp(grid,i+1,j,m,n,sum,arr);
        sum = a+b;
        arr[i][j] = sum;
        return arr[i][j];   
    }
}