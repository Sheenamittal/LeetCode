class Solution {
    public int minLength(String s) {
        char arr[] = s.toCharArray();
        int n = arr.length;
        int ind = -1;
        for(int i = 0; i < n; i++) {
            char ch = arr[i];
            if(ind == -1) {
                ind++;
                arr[ind] = ch;
            }
            else if(ch == 'B' && arr[ind] == 'A') ind--;
            else if(ch == 'D' && arr[ind] == 'C') ind--;
            else {
                ind++;
                arr[ind] = ch;
            }
        }
        return ind + 1;
    }
}
