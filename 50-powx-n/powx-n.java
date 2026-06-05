class Solution {
    
    private double myDouble(double x, long N){
        if( N == 0){
            return 1;
        }
        if (x == 0){
            return 0;
        }
        if( N < 0){
            return 1.0 / myDouble(x, -N);
        }
        else if(N%2 == 1){
            return x * myDouble(x*x, (N-1)/2 );
        }
        else{
            return myDouble(x*x, N/2);
        }
    }
    
    public double myPow(double x, int n) {

        long N = n; 
        
        return myDouble(x,N);
        

        
    }
}