class Solution {
    public int maxArea(int[] height) {
        int st = 0;
    int en =height.length - 1;
    int area = Integer.MIN_VALUE;
    while(st < en && en >= 0){
        int temp = (en - st) * Math.min(height[en], height[st]);
        if(temp > area) area = temp;
        else if( height[st] < height[en]){
            st++;
        }
        else en--;
    }
    return area;
    }
}
