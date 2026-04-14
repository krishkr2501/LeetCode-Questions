class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        while(left<=right){
            int cnt = cntbits(left);
            if (cnt == 2 || cnt == 3 || cnt == 5 || cnt == 7 || cnt == 11 || 
                cnt == 13 || cnt == 17 || cnt == 19 || cnt == 23 || cnt == 29 || cnt == 31) {
                ans++;
            }
            left++;
        }
        return ans;
    }
    private int cntbits(int num){
        int cnt = 0;
        while(num>0){
            num &= num-1;
            cnt++;
        }
        return cnt;
    }
}