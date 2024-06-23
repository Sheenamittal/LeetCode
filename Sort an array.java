class Solution {
    public int[] sortArray(int[] nums) {
        int n = 50001;
        int pos[]=new int[n];
        int neg[]= new int[n];
        for(int i:nums){
            if(i>=0){
                pos[i]++;
            }
            else{
                neg[i*-1]++;
            }
        }
        int total = nums.length;
        int ans[] =new int[total];
        int index =0;

        for(int i=n-1;i>=0;i--){
            if(neg[i]>0){
                for(int jj=0;jj<neg[i];jj++){
                    ans[index++]= i*-1;
                }
            }
        }

        for(int i=0;i<n;i++){
            if(pos[i]>0){
                for(int jj=0;jj<pos[i];jj++){
                    ans[index++]=i;
                }
            }
        }
        return ans;
    }
}
