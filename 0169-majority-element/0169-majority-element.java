class Solution {
    public int majorityElement(int[] nums) {
        int can = 0;
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(cnt == 0){
                can = nums[i];
                cnt++;
            }
            else if(can == nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return can;
    }
}