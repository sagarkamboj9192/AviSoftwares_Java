import java.util.Scanner;

public class geometricsum {
    double geosum(int k, double i, double sum)
    {
        if(i > k){
            return sum;
        }
        double val =  (double) 1/(double)Math.pow(2d, i);
        sum+=val;        
        return geosum(k, i+1, sum);

    }
    public static void main(String[] args)
    {
        Scanner obj = new  Scanner(System.in);
        int k = obj.nextInt();

        geometricsum ob = new geometricsum();
        System.out.println(ob.geosum(k, 0d,0d));

        // double i=1d;
        // i++;
        // double sum= 0d;
        
        // sum=sum + 1/(double)Math.pow(2.0, i);
        // System.out.println(sum);
        
        obj.close();
                
    }
}
