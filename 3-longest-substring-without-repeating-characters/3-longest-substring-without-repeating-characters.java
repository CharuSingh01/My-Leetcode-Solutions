class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=-1;
        int j=-1;
        int maxLen=Integer.MIN_VALUE;
        while(true){
            boolean check1=false;
            boolean check2=false;
            while(i<s.length()-1){
                check1=true;
                i++;
                char ch=s.charAt(i);
                if(map.containsKey(ch)==false){
                    map.put(ch,1);
                }
                else{
                     map.put(ch,map.get(ch)+1);
                }
               
                if(map.get(ch)==1){
                    maxLen=Math.max(maxLen,i-j);
                }
                else{
                    break;
                }
            }
            while(j<i){
                check2=true;
                j++;
                char ch=s.charAt(j);
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==1) break;
            }
            if(check1==false && check2==false)break;
        }
        if(maxLen==Integer.MIN_VALUE)return 0;
        return maxLen;
    }
}