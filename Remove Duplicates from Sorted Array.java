class Solution {
    public int removeDuplicates(int[] nums) {
       int i=0;
       int n = nums.length;
       for(int j=1;j<n;j++){
        if(nums[i]==nums[j]){
            continue;
        }
        nums[i+1]=nums[j];
        i++;
       }
       return i+1;
    }
}
