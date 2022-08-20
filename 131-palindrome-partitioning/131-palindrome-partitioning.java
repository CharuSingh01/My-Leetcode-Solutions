class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        solution(s,0,new ArrayList<>(),result);
        return result;
        
        
       
    }
    public void solution(String s,int index,List<String> path, List<List<String>> result){
           if(index==s.length()){
               result.add(new ArrayList<>(path));
               return;
           }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                path.add(s.substring(index,i+1));
                solution(s,i+1,path,result);
                path.remove(path.size()-1);
            }
        }
    }
  
    public boolean isPalindrome(String s,int i,int j){
       boolean check=true;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                check=false;
                break;
            }
            i++;
            j--;
        }
        return check;
    }
}