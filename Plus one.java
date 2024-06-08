class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (digits[i] == 9){
            if (i == 0){
                int[] res = new int[digits.length + 1];
                res[0] = 1;
                return res;
            }
            digits[i] = 0;
            i -= 1;
        }
        digits[i] += 1;
        return digits;
    }
}
