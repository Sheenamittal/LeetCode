class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap();
        for(int currIdx=0;currIdx<nums.length;currIdx++){
            if(map.containsKey(nums[currIdx])){
                int pastIdx = map.get(nums[currIdx]);
                if(Math.abs(pastIdx-currIdx)<=k){
                    return true;
                }
            }
            map.put(nums[currIdx], currIdx);
        }
        return false;
    }
}
