class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
      double x1=myPow(x,Math.abs(n/2));
        if(n%2==0){
            if(n<0){
                 return 1/(x1*x1);
            }
            else{
            return x1*x1;}
        }
        else{
            if(n<0){
                return 1/(x1*x1*x);
            }
            else{
            return x1*x1*x;
            }
        }
        
    }
}