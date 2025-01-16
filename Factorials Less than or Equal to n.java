class Solution {
    static void result(long n, long fact, int i, ArrayList<Long>res){
        if(fact>n){
            return ;
        }
        res.add(fact);
        result(n,fact*(i+1),i+1,res);
    }
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> res= new ArrayList<>();
        result(n,1,1,res);
        return res;
    }
}
