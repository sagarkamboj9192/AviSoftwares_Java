class funct{
    public int powerofx(int x, int n)
    {
        if(n == 0 ){
            return 1;
        }
        if(n == 1 ){
            return x;
        }
        int val = powerofx(x, n/2);
        if(n%2 == 0){
            return val*val;
        }
        else{
            return x*val*val;
        }
    }
}
public class quest5 {
    
    public static void main(String[] pra)
    { 
        int x=3;
        int n=2;
        funct obj= new funct();
        int ans= obj.powerofx(x, n);
        System.out.println("The answer is: "+ans);
    }
}
