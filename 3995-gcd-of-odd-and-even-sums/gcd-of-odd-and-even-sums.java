class Solution {
    public int gcdOfOddEvenSums(int n) {
        int esum=0;
        int osum=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==0){
                esum+=i;
            }
            else{
                osum+=i;
            }
        }
       int res= gcd(esum,osum);
       return res;

    }
    public static int  gcd(int a,int b){
        while(b!=0){
            int rem=a%b;
             a=b;
             b=rem;
        }
        return a;
    }

}