class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] arr = new int[101];
        int pairs = 0;
        for(int num : nums) {
            arr[num]++;
        }

        for(int i=0;i<arr.length;i++) {
            pairs+= arr[i]/2;
        }

        int remaining = nums.length - 2*pairs;
        int[] res = new int[2];
        res[0] = pairs;
        res[1] = remaining;

        return res;
    }
}