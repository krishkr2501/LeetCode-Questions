class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int[][] arr = new int[dungeon.length][dungeon[0].length];
        for(int i=0;i<dungeon.length;i++){
            Arrays.fill(arr[i],-1);
        }
        return dp(dungeon,0,0,arr);
    }
    private int dp(int[][] nums,int i,int j,int[][] arr){
        if(i==nums.length-1 && j==nums[0].length-1){
            return Math.max(1, 1 - nums[i][j]);
        }
        if(i>=nums.length || j>=nums[0].length){
            return Integer.MAX_VALUE;
        }
        if(arr[i][j] != -1){
            return arr[i][j];
        }
        int right = dp(nums,i+1,j,arr);
        int down = dp(nums,i,j+1,arr);
        int ans = Math.min(right,down)-nums[i][j];
        ans = Math.max(ans,1);
        arr[i][j] = ans;
        return arr[i][j];
    }
}