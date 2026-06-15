class Solution {
    public int minDistance(String word1, String word2) {
        int[][] memo = new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<memo.length;i++){
            Arrays.fill(memo[i],-1);
        }
        return ed(word1.length(),word2.length(),word1,word2,memo);
    }
    private int ed(int i, int j, String w1, String w2, int[][] memo){
        if(i==0) return j;
        if(j==0) return i;
        if(memo[i][j] != -1) return memo[i][j];
        if(w1.charAt(i-1) == w2.charAt(j-1)){
            memo[i][j] = ed(i-1,j-1,w1,w2,memo);
        }
        else{
            memo[i][j] = 1+Math.min(ed(i-1,j,w1,w2,memo),Math.min(ed(i,j-1,w1,w2,memo),
            ed(i-1,j-1,w1,w2,memo)));
        }
        return memo[i][j];
    }
}