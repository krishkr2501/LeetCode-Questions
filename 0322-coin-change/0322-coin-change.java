class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] memo = new int[coins.length][amount+1];
        for(int[] val: memo){
            Arrays.fill(val,-1);
        }
        int ans = mincoin(coins,0,amount,memo);
        if(ans != Integer.MAX_VALUE) return ans;
        return -1;
    }
    private int mincoin(int[] coins, int i,int amt,int[][] memo){
        if(amt == 0) return 0;
        if(i>=coins.length || amt<0) return Integer.MAX_VALUE;
        if(memo[i][amt] != -1) return memo[i][amt];
        int inc = mincoin(coins,i,amt-coins[i],memo);
        if(inc != Integer.MAX_VALUE) inc = 1 +inc;
        int not = mincoin(coins,i+1,amt,memo);
        memo[i][amt] = Math.min(inc,not);
        return memo[i][amt];
    }
}