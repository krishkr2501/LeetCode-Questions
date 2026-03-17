class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str = "";
        String ft = strs[0];
        String lt = strs[strs.length-1];
        for(int i=0;i<Math.min(ft.length(),lt.length());i++){
            if(ft.charAt(i) == lt.charAt(i)){
                str += ft.charAt(i);
            }
            else{
                return str;
            }
        }
        return str;
    }
}