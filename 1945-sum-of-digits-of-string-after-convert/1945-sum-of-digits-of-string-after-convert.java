class Solution {
    public int getLucky(String s, int k) {
        String stp = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int val = (ch - 'a' + 1);
            stp += val;
        }
        
        int sum = 0;
        for (int i = 0; i < stp.length(); i++) {
            sum += stp.charAt(i) - '0';
        }
        
        int cnt = 1;
        while (cnt < k) {
            int num = sum;
            sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            cnt++;
        }
        
        return sum;
    }
}
