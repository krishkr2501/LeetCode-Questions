class Solution {
    public boolean isPalindrome(String s) {
        String c = s.toLowerCase().replaceAll("[^a-z0-9]", "");
       

        int i=0;
        int j= c.length()-1;
        if(c.length()==0 || c.length() == 1){
            return true;
        }
        while(i<j){
            if(c.charAt(i) != c.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}