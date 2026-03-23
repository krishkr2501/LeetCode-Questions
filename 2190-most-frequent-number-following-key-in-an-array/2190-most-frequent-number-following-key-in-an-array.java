class Solution {
    public int mostFrequent(int[] nums, int key) {
        int m = nums.length, mx = 0, mxFreq = 0;
        int[] map = new int[1001];

        for (int i = 1; i < m; i++) {
            int curr = nums[i];

            if (nums[i - 1] == key) {
                if (++map[curr] > mxFreq) {
                    mxFreq = map[curr];
                    mx = curr;
                }
            }
        } 

        return mx;
    }
} 