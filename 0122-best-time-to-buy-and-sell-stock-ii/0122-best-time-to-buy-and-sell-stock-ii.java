class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int[][] idx = new int[prices.length][2];
        for(int i=0;i<prices.length;i++){
            idx[i][0] = i;
            idx[i][1] = prices[i];
        }
        int pft = 0;
        Arrays.sort(idx,(a,b) -> Integer.compare(a[0],b[0]));
        for(int i=0;i+1<idx.length;i++){
            if(idx[i+1][1]>idx[i][1]){
                pft += Math.abs(idx[i][1]-idx[i+1][1]);
            }
        }
        return pft;
    }
}