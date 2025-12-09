class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = Integer.MIN_VALUE;
        if(nums.length == 1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            max = Math.max(max, nums[i]);
        }
        int[] arr = new int[max+1];
        int[] memo = new int[arr.length+1];
        Arrays.fill(memo,-1);
        for(int i=0;i<nums.length;i++){
            max = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    max++;
                }
            }
            arr[nums[i]] = max;
        }
        return dp(arr,0,memo);
    }
    private int dp(int[] arr,int i,int[] memo){
        if(i>=arr.length){
            return 0;
        }
        if(memo[i] != -1){
            return memo[i];
        }
        int del = i*arr[i] + dp(arr,i+2,memo);
        int leave = dp(arr,i+1,memo);
        memo[i] = Math.max(del,leave);
        return memo[i];
    }
}