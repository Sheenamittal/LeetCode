class Solution {
    public int[][] generateMatrix(int n) {
      int[][] result = new int[n][n];
        int k = 0;
        int left = 0, right = n - 1;
      int top = 0, bottom = n - 1;
      int dir = 0;
      while(left <= right && top <= bottom) {
          if(dir == 0) { // Traverse from left to right
              for(int i = left; i <= right; i ++) 
              result[top][i] = ++ k;
              top ++;
          }
          else if(dir == 1) { // Traverse from top to bottom
              for(int i = top; i <= bottom; i ++)
              result[i][right] = ++ k;
              right --;
          }
          else if(dir == 2) { // Traverse from right to left
              for(int i = right; i >= left; i --) 
              result[bottom][i] = ++ k;
              bottom --;
          }
          else if(dir == 3) { // Traverse from bottom to top
              for(int i = bottom; i >= top; i --)
              result[i][left] = ++ k;
              left ++;
          }
          dir = (dir + 1) % 4;
      }
        return result;
    }
}
