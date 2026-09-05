class Solution {
    public boolean detectCapitalUse(String word) {
        int upr = 0;
        for(int i=0;i<word.length();i++){
            char curr = word.charAt(i);
            if(Character.isUpperCase(curr)) upr++;
        }
        if(upr == word.length() || upr == 0 ||(upr==1 && Character.isUpperCase(word.charAt(0)))){
            return true;
        }
        return false;
    }
}