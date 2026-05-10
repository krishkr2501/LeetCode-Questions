class Solution {
    public String defangIPaddr(String address) {
        String ans = "";
        char[] ele = new char[address.length()];
        for(int i=0;i<address.length();i++){
            ele[i] = address.charAt(i);
        }
        for(int i=0;i<ele.length;i++){
            if(ele[i] == '.'){
                ans += '[';
                ans +='.';
                ans += ']';
            }
            else{
                ans += ele[i];
            }
        }
        return ans;
    }
}