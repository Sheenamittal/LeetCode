class Solution {
    public int[] beautifulArray(int n) {
        int[] res = new int[n];
        if(n==1){
            return new int[] {1};
        }
        else if(n==2){
            return new int[] {1,2};
        }
        else{
            int[] odd = beautifulArray((n+1)/2);
            int[] even = beautifulArray(n/2);
            for(int i=0;i<odd.length;i++){
                res[i] = odd[i]*2-1;
            }
            for(int j=0;j<even.length;j++){
                res[odd.length+j]=even[j]*2;
            }
        }
        return res;
    }
}
