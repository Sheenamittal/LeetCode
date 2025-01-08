class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int num = n;
        int sum =0;
        while(n !=0){
            int last = n %10;
            sum = sum + (last*last*last);
            n = n/10;
        }
        if(sum==num){
            return true;
        }
        else{
            return false;
        }
    }
}
