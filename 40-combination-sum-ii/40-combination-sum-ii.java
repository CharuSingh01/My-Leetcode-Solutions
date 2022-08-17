class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
            List<List<Integer>> result=new ArrayList<>();
      
        solution(candidates,target,0,new ArrayList<>(),result);
        return result;
    }

    
    public void solution(int[] candidates, int target,int idx,List<Integer> ele,List<List<Integer>> result){
        if(target==0 ){
            result.add(new ArrayList<>(ele));
            return;
        }
   for(int i=idx;i<candidates.length;i++){
       if(i>idx && candidates[i]==candidates[i-1])continue;
    if(candidates[idx]>target)break;
    ele.add(candidates[i]);
    solution(candidates,target-candidates[i],i+1,ele,result);
    ele.remove(ele.size()-1);
    }
}
}