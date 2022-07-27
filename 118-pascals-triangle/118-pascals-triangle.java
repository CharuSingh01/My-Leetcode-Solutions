class Solution {
    public List<List<Integer>> generate(int n) {
       if(n==1){
            List<Integer> bc=new ArrayList<>();
            bc.add(1);
           List<List<Integer>> result=new ArrayList<>();
            result.add(bc);
            return result;
        }
           
        // if(n==2){
        //     List<Integer> bc=new ArrayList<>();
        //     bc.add(1);
        //     bc.add(1);
        //     List<List<Integer>> result=new ArrayList<>();
        //     result.add(bc);
        //     return result;
        // }
        List<List<Integer>> pres=generate(n-1);
        List<Integer> llist=pres.get(pres.size()-1);
        List<Integer>mres=new ArrayList<>();
        mres.add(1);
        for(int i=0;i<llist.size()-1;i++){
            mres.add(llist.get(i)+llist.get(i+1));
        }
        mres.add(1);
        pres.add(mres);
        return pres;
    }
 
}