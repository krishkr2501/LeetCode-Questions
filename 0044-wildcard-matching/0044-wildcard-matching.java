class Solution {
    public boolean isMatch(String s, String p) {
        if (s.equals(p)) return true;

        int n = s.length();
        int m = p.length();

        Boolean[][] dp = new Boolean[n][m];

        return check(dp, n - 1, m - 1, s, p);
    }

    private boolean check(Boolean[][] dp, int i, int j, String s, String p) {
        if (i < 0 && j < 0) return true;
        if (i >= 0 && j < 0) return false;

        if (i < 0 && j >= 0) {
            for (int k = 0; k <= j; k++) {
                if (p.charAt(k) != '*') return false;
            }
            return true;
        }

        if (dp[i][j] != null) return dp[i][j];

        if (s.charAt(i) == p.charAt(j))
            return dp[i][j] = check(dp, i - 1, j - 1, s, p);

        if (p.charAt(j) == '?')
            return dp[i][j] = check(dp, i - 1, j - 1, s, p);

        if (p.charAt(j) == '*')
            return dp[i][j] = check(dp, i - 1, j, s, p) || check(dp, i, j - 1, s, p);

        return dp[i][j] = false;
    }
}