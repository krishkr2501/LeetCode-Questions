class Solution {
    public int findGCD(int[] nums) {
        int small = Integer.MAX_VALUE;
        int lar = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>lar) lar = nums[i];
            if(nums[i]<small) small = nums[i];
        }
        int ans = 0;
        for(int i=1;i<=small;i++){
            if(small%i == 0 && lar%i == 0){
                ans = i;
            }
        }
        return ans;
    }
}