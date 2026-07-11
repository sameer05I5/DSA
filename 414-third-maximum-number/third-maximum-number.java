class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int ind:nums){
            set.add(ind);
            if(set.size()>3){
                set.pollFirst();
            }
        }
        if(set.size()==3){
           return set.first();
        }
        return set.last();
        
        
    }
}