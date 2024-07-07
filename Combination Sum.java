class Solution {
    public void rec(int[] arr, int target, int idx, List<List<Integer>> ans,List<Integer> list){
        if(idx==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[idx]<=target){
            list.add(arr[idx]);
            rec(arr, target-arr[idx], idx, ans, list);
            list.remove(list.size()-1);
        }
        rec(arr, target, idx+1, ans, list);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        rec(candidates, target,0, ans, list);
        return ans;
    }
}
