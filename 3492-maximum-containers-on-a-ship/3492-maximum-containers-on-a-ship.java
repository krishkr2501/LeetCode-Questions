class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int ans = 0;
        if(maxWeight/w < n*n){
            return maxWeight/w;
        }
        return n*n;
    }
}