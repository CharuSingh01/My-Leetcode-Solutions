class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        solution(candidates,target,0,new ArrayList<>(),result);
        return result;
    }
    public void solution(int[] candidates, int target,int idx,List<Integer> ele,List<List<Integer>> result){
        if(idx==candidates.length){
            if(target==0){
                result.add(new ArrayList<>(ele));
            }
            return;
        }
        
        if(candidates[idx]<=target){
        ele.add(candidates[idx]);
        solution(candidates,target-candidates[idx],idx,ele,result);
        ele.remove(ele.size()-1);
        }
        solution(candidates,target,idx+1,ele,result);
    }
}