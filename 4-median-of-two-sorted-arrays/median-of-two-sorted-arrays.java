class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int num3[]=new int[m+n];
        int ind=0;
        for(int i=0;i<m;i++){
            num3[ind]=nums1[i];  
            ind++;         
        }
        for(int j=0;j<n;j++){
            num3[ind]=nums2[j];
            ind++;
        }  
        Arrays.sort(num3);
        int length=num3.length;
        double ans=0;
        if(length%2==0){
            int middle=length/2;
            int prevmidd=(length/2)-1;
             ans=(num3[middle]+num3[prevmidd])/2.0;
        }else{
             ans=num3[length/2];
        }
        return ans;
             
    }
}