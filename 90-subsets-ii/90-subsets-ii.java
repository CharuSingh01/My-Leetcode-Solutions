class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();
        solution(nums,0,new ArrayList<>(),result,set);
        return result;
    }
    public void solution(int[] nums,int idx,List<Integer> ele,List<List<Integer>> result,HashSet<List<Integer>> set){
        if(idx==nums.length){
            if(set.contains(ele)==false){
            result.add(new ArrayList<>(ele));
             set.add(ele);   
            }
            return;
        }
        solution(nums,idx+1,ele,result,set);
        ele.add(nums[idx]);
        solution(nums,idx+1,ele,result,set);
        ele.remove(ele.size()-1);
        
        
        
    }
}