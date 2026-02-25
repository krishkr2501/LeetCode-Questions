class Solution {
    public int pivotIndex(int[] nums) {
        int ptr1 = 0;
        int ptr2 = nums.length;
        int sump1 = 0;
        int sump2 = 0;
        while(ptr1<nums.length){
            sump2 += nums[ptr1];
            ptr1++;
        }
        ptr1 = 0;
        while(ptr1<ptr2){
            sump2 -= nums[ptr1];
            if(sump2 == sump1){
                return ptr1;
            }
            sump1 += nums[ptr1];
            ptr1++;
        }
        return -1;
    }
}