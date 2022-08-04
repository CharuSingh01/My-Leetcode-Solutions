class Solution {
    public int characterReplacement(String s, int k) {
        int i=-1;
        int j=-1;
        HashMap<Character,Integer> map=new HashMap<>();
        int maxLen=0;
        int maxFreq=0;
        while(true){
            boolean check1=false;
            boolean check2=false;
            while(i<s.length()-1){
                i++;
                check1=true;
                char ch=s.charAt(i);
                if(map.containsKey(ch)==false){
                    map.put(ch,1);
                }
                else{
                    map.put(ch,map.get(ch)+1);
                }
                maxFreq=Math.max(maxFreq,map.get(ch));
                int length=i-j-maxFreq;
               // System.out.println("length "+length);
                if(length<=k){
                    maxLen=Math.max(maxLen,i-j);
                }
                else{
                    break;
                }
            }
            while(j<i){
                j++;
                check2=true;
                char ch=s.charAt(j);
                
                map.put(ch,map.get(ch)-1);
                 maxFreq=Math.max(maxFreq,map.get(ch));
                
                int length=i-j-maxFreq;
                if(length<=k){
                  break;
                }
                
            }
            if(check1==false && check2==false)break;
        }
        return maxLen;
    }
}