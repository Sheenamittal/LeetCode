class Solution {
    int sumOfSeries(int n) {
        int sum=0;
        if(n==0){
            return 0;
        }
        else{
            for(int i=1;i<=n;i++){
                sum=sum +(i*i*i);
            }
        }
        return sum;
    }
}
