class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        ArrayList<Integer> li = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                li.add(nums1[i]);
                i++;
            }else if(nums1[i]==nums2[j]){
                li.add(nums2[j]);
                j++;
                li.add(nums1[i]);
                i++;
            }else{
                li.add(nums2[j]);
                j++;
            }
        }

        while(i<nums1.length){
            li.add(nums1[i]);
            i++;
        }
        while(j<nums2.length){
            li.add(nums2[j]);
            j++;
        }
        
        double val =0.00;
        if(li.size()%2!=0){
             val = li.get(li.size()/2);
        }else{
            int mid = li.size()/2;
            return (double)(li.get(mid)+li.get(mid-1))/2; 
        }

        return val;
        
    }
}