class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int i=1;
        while(i<=100){
            if(!set.contains(k*i))
                return k*i;
            i++;
            
        }
        return k*i;
    }
}