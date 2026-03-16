class Solution {
    public int trap(int[] height) {
        int[] lf = new int[height.length];
        int[] rt = new int[height.length];
        int left = 0;
        for(int i=1;i<height.length;i++){
            if(height[i-1]>left){
                lf[i] = height[i-1];
                left = height[i-1];
            }
            lf[i] = left;
        }
        int right = 0;
        for(int i=height.length-2;i>=0;i--){
            if(height[i+1]>right){
                rt[i] = height[i+1];
                right = height[i+1];
            }
            rt[i] = right;
        }
        int ans = 0;
        for(int i=1;i<lf.length;i++){
            int diff = Math.min(lf[i],rt[i])-height[i];
            if(diff>0){
                ans += diff;
            }
        }
        return ans;
    }
}