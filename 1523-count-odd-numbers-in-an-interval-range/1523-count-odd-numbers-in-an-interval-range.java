class Solution {
    public int countOdds(int low, int high) {
        int cnt = 0;
        if(low%2 != 0){
            while(low<=high){
                cnt++;
                low += 2;
            }
        }
        else{
            low++;
            while(low<=high){
                cnt++;
                low += 2;
            }
        }
        return cnt;
    }
}