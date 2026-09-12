class Solution {
    public int removeDuplicates(int[] nums) {
        int curr = 0;
        int next = 0;
        int cnt = 1;
        while(next<nums.length){
            if(nums[curr] == nums[next]) next++;
            else{
                curr++;
                nums[curr] = nums[next];
                cnt++;
            }
        }
        return cnt;
    }
}