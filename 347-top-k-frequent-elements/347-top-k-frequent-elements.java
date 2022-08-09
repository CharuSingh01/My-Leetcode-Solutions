class Solution {
    public class pair implements Comparable<pair>{
        int val;
        int freq;
        pair(int val,int freq){
            this.val=val;
            this.freq=freq;
        }
        public int compareTo(pair o){
            return this.freq-o.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<pair> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key:map.keySet()){
            pair mp=new pair(key,map.get(key));
            pq.add(mp);
            if(pq.size()>k){
                pq.remove();
            }
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.peek().val;
            pq.remove();
        }
        return ans;
    }
}