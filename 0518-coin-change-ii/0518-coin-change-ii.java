class Solution {
    public int change(int amount, int[] coins) {
        int[][] arr = new int[coins.length + 1][amount + 1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = -1;
            }
        }
        return dp(coins, 0, amount, arr);
    }

    private int dp(int[] coins, int i, int amt, int[][] arr) {
        if (amt == 0) {
            return 1;  
        }
        if (i >= coins.length || amt < 0) {
            return 0;  
        }
        if (arr[i][amt] != -1) {
            return arr[i][amt];
        }

        int inc = dp(coins, i, amt - coins[i], arr);
        int exc = dp(coins, i + 1, amt, arr);

        arr[i][amt] = inc + exc;  
        return arr[i][amt];
    }
}