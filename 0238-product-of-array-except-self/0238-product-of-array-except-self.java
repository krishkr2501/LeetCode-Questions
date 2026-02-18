class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        int pr = 1;
        int zeroCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                pr *= nums[i];
            } else {
                zeroCount++;
            }
        }
        int prprev = pr;
        for(int i = 0; i < nums.length; i++){
            if(zeroCount > 1){
                product[i] = 0;
            } else if(nums[i] == 0){
                product[i] = prprev;
            } else if(zeroCount == 1){
                product[i] = 0;
            } else {
                pr = prprev / nums[i];
                product[i] = pr;
                pr = prprev;
            }
        }
        return product;
    }
}