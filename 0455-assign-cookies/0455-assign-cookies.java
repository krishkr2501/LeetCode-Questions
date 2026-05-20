class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length==0) return 0;
        Arrays.sort(g);
        rev(g);
        Arrays.sort(s);
        rev(s);
        int max = 0;
        int i=0;
        int j=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                max++;
                i++;
                j++;
            }
            else{
               i++; 
            }
        }
        return max;
    }
    private void rev(int[] arr){
        int i=0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}