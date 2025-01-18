class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        int left=0;
        int right = n-1;
        if(left>=right){
            return;
        }
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
