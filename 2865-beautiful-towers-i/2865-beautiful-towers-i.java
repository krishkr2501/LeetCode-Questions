class Solution {
    public long maximumSumOfHeights(int[] heights) {
        int n = heights.length;
        long max = 0;
        for(int i=0;i<n;i++){
            int temp = i-1;
            long sum = heights[i];
            long prev = heights[i];
            while(temp>=0){
                prev = Math.min(prev,heights[temp]);
                sum += prev;
                temp--;
            }
            max = Math.max(sum,max);
            temp = i+1;
            prev = heights[i];
            while(temp<n){
                prev = Math.min(prev,heights[temp]);
                sum += prev;
                temp++;
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}