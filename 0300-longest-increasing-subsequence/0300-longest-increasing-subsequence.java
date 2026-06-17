class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] memo = new int[nums.length+1][nums.length+1];
        for(int[] num:memo){
            Arrays.fill(num,-1);
        }
        return dp(0,-1,nums,memo);
    }
    private int dp(int curr,int prev,int[] nums,int[][] memo){
        if(curr>=nums.length) return 0;
        if(memo[curr][prev+1] != -1) return memo[curr][prev+1];
        int len = dp(curr+1,prev,nums,memo);
        if(prev == -1 || nums[curr]>nums[prev]){
            len = Math.max(len,1+dp(curr+1,curr,nums,memo));
        }
        memo[curr][prev+1] = len;
        return memo[curr][prev+1];
    }
}