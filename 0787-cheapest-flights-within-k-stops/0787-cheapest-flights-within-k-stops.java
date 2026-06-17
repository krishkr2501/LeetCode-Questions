class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<int[]>> ls = new ArrayList<>();
        for(int i=0;i<n;i++){
            ls.add(new ArrayList<>());
        } 
        for(int[] flight:flights){
            ls.get(flight[0]).add(new int[]{flight[1],flight[2]});
        }
        int[] prices = new int[n];
        Arrays.fill(prices,Integer.MAX_VALUE);
        prices[src] = 0;
        Queue<int[]> qe = new LinkedList<>();
        qe.offer(new int[]{src,0});
        int stops = 0;
        while(!qe.isEmpty() && stops<=k){
            int size = qe.size();
            for(int i=0;i<size;i++){
                int[] curr = qe.poll();
                int u = curr[0];
                int cost = curr[1];
                for(int[] neighbour:ls.get(u)){
                    int v = neighbour[0];
                    int price = neighbour[1];
                    if(cost+price<prices[v]){
                        prices[v] = cost+price;
                        qe.offer(new int[]{v,prices[v]});
                    }
                }
            }
            stops++;
        }
        if(prices[dst] != Integer.MAX_VALUE) return prices[dst];
        return -1;
    }
}