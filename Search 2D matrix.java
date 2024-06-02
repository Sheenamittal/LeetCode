class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length-1;
        int mid = 0;
        while(low<=high){
            mid = (low+high)/2;
            if(matrix[mid][0]== target){
                return true;
            }
            else if(matrix[mid][0]<target){
                if(matrix[mid][matrix[mid].length-1]>=target){
                    break;
                }
                low = mid+1;
            }
            else if(matrix[mid][0]>target){
                if(matrix[mid][matrix[mid].length-1]<=target){
                    break;
                }
                high = mid-1;
            }
        }
        low = 0;
        high = matrix[mid].length-1;
        int mid2 = 0;
        while(low<=high){
            mid2 = (low+high)/2;
            if(matrix[mid][mid2]==target){
                return true;
            }
            else if(matrix[mid][mid2]<target){
                low= mid2+1;
            }
            else if(matrix[mid][mid2]>target){
                high=mid2-1;
            }
        }
        return false;
    }
}
