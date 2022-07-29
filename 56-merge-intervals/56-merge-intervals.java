// Brute Force Approach:
// Sort the array according to starting time
// for every pair, find the pairs which are merging with it and add the final pair after
// merging to a data structure.
// Time Complexity: O(NlogN) for sortinig the array and O(N^2) for checking values for each // pair



// Approach 
//Sort the array according to starting time
//Create a stack and initially push 1st values of starting and ending time
// Now while pushing the other start time end time pair apply 3 conditions:
// if the next interal lies in between the previous interval, continue;
// if st(next interval)<=et (previous interval) && et(next interval)> et(previous interval)
//merge the intervals by popping the peak value of stack and adding et(next interval)
//if st(next interval) > et(previous interval) simply push both new values to stack
// Time Complexity: O(NlogN) for sortinig the array and O(N) for filling the stack

class Solution {
    public int[][] merge(int[][] intervals) {
        Pair[] arr=new Pair[intervals.length];
        for(int i=0;i<intervals.length;i++){
            int[] ele=intervals[i];
            Pair mp=new Pair(ele[0],ele[1]);
            arr[i]=mp;
        }
        Arrays.sort(arr);
        Stack<Integer> st=new Stack<>();
        st.push(arr[0].s);
        st.push(arr[0].e);
        for(int i=1;i<arr.length;i++){
            Pair mp=arr[i];
            int stime=mp.s;
            int etime=mp.e;
            if(stime<=st.peek() && etime>st.peek()){
                st.pop();
                st.push(etime);
            }
            else if(stime>st.peek()){
                st.push(stime);
                st.push(etime);
            }
        }
        int[][]ans=new int[st.size()/2][2];
        int c=ans.length-1;
       while(st.size()>0){
           int etim=st.pop();
           int stim=st.pop();
           ans[c][0]=stim;
           ans[c][1]=etim;
           c--;
       }
        return ans;
    }
    public class Pair implements Comparable<Pair>{
        int s;
        int e;
        Pair(int s,int e){
            this.s=s;
            this.e=e;
        }
        public int compareTo(Pair o){
            if(this.s!=o.s){
                return this.s-o.s;
            }
            else{
                return this.e-o.e;
            }
        }
    }
}