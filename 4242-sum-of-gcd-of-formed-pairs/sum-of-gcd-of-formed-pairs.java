class Solution {
    
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int prfixGCD[]=new int[n];
        int mx=0;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,nums[i]);
            prfixGCD[i]=gcd(nums[i],mx);
        }
        Arrays.sort(prfixGCD);
        long ans=0;
        int left=0,right=n-1;
        while(left<right){
            ans+=gcd(prfixGCD[left],prfixGCD[right]);
            left++;
            right--;

        }
        return ans;
    }
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }    
}