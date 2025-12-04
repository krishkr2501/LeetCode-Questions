class Solution {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(arr[i], -1);   
        }
        return backtrack(0,0,m,n,0,arr);
    }
    private int backtrack(int i,int j,int m, int n,int sum,int[][] arr){
        if(i>=m || j>=n){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(arr[i][j] != -1){
            return arr[i][j];
        }
        int a = backtrack(i,j+1,m,n,sum,arr);
        int b = backtrack(i+1,j,m,n,sum,arr);
        sum = a+b;
        arr[i][j] = sum;
        return arr[i][j];
    }
}