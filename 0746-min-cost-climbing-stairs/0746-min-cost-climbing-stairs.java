class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] arr = new int[cost.length+1];
        Arrays.fill(arr,-1);
        int zero = dp(cost,0,arr);
        int one = dp(cost,1,arr);
        return Math.min(zero,one);
    }
    private int dp(int[] cost,int i,int[] arr){
        if(i>=cost.length){
            return 0;
        }
        if(arr[i] != -1) return arr[i];
        int onestep = dp(cost,i+1,arr);
        int twostep = dp(cost,i+2,arr);
        arr[i] = cost[i] + Math.min(onestep,twostep);
        return arr[i];
    }
}