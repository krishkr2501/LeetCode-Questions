class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        Arrays.fill(arr1, -10);
        Arrays.fill(arr2, -10);
        
        return Math.max(dp(nums, 0, nums.length - 2, arr1),
                        dp(nums, 1, nums.length - 1, arr2));
    }
    
    private int dp(int[] nums, int i, int end, int[] arr) {
        if (i > end) {
            return 0;
        }
        if (arr[i] != -10) {
            return arr[i];
        }
        int rob = nums[i] + dp(nums, i + 2, end, arr);
        int skip = dp(nums, i + 1, end, arr);
        arr[i] = Math.max(rob, skip);
        return arr[i];
    }
}