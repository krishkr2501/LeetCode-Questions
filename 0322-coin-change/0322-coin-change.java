class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] arr = new int[coins.length + 1][amount + 1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = -2;
            }
        }
        int ans = dp(coins, 0, amount, arr);
        if (ans == Integer.MAX_VALUE) {
            return -1;
        } else {
            return ans;
        }
    }

    private int dp(int[] coins, int i, int amt, int[][] arr) {
        if (amt == 0) {
            return 0;
        }
        if (i >= coins.length || amt < 0) {
            return Integer.MAX_VALUE;
        }
        if (arr[i][amt] != -2) {
            return arr[i][amt];
        }
        int incResult = dp(coins, i, amt - coins[i], arr);
        int inc = 0;
        if (incResult == Integer.MAX_VALUE) {
            inc = Integer.MAX_VALUE;
        } else {
            inc = 1 + incResult;

        }
        int lea = dp(coins, i + 1, amt, arr);
        arr[i][amt] = Math.min(inc, lea);
        return arr[i][amt];
    }
}
