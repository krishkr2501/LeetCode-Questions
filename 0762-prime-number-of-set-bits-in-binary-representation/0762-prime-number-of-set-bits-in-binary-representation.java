class Solution {
    public int countPrimeSetBits(int left, int right) {
        int cnt = 0;
        while(left<=right){
            String bits = Integer.toBinaryString(left);
            int ones = 0;
            for(int i=0;i<bits.length();i++){
                if(bits.charAt(i) == '1'){
                    ones++;
                }
            }
            if (ones > 1) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(ones); i++) {
                if (ones % i == 0) {
                    isPrime = false; 
                    break;
                }
            }
            if (isPrime) {
                cnt++; 
            }
        }
        left++;
        }
        return cnt;
    }
}