class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int mid = totalLength / 2;
        int i = 0, j = 0;
        int previous = 0, current = 0;
        while(i + j <= mid){
            previous = current;
            if (i < nums1.length && (j == nums2.length || nums1[i] < nums2[j])){
                current = nums1[i];
                i++;
            } else{
                current = nums2[j];
                j++;
            }
        }
        if(totalLength % 2 != 0){
            return current;
        } else {
            return (previous + current) / 2.0;
        }
    }
}