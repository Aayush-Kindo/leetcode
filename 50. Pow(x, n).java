class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        
        double xbn =myPow(x,n/2);
        double xn=xbn*xbn;
        System.out.println("n="+n);
        System.out.println("output"+xn);
        
        if(n%2==0){    // no odd power
            return  xn;
                
        }else if(n>0){      // if power is odd
            return xn*x;
}else  {
            return xn/x;        //if power is -ve
                               //--->output/number
            
            //this will add fraction value when returning 1 frm n=0
            //also will do same work as xn*n when odd power of n is detected
        }
          
    
    }
}