class Solution {
    public int missingInteger(int[] nums) {
        int n =nums.length;
        int seqsum=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1){
                seqsum+=nums[i];
            }
            else
                break;
        }
        while(true){
            boolean found =false;
            for(int num:nums){
                if(num == seqsum){
                    found = true;
                    break;
                }
            }
            if(!found){
                return seqsum;
            }
            seqsum++;
        }
    }
}