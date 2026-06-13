class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans = "";
        long sum = 0;
        for(int i=0;i<words.length;i++){
            String curr = words[i];
            for(int j=0;j<curr.length();j++){
                sum += weights[curr.charAt(j)-'a'];
            }
            int rem = (int)(sum%26);
            ans +=(char)('z' - rem);
            sum = 0;
        }
        return ans;
    }
}