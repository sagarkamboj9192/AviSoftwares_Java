class vaisehi{
    // private int a=90;
    int b=10;
}
public class pract {
    static void arr()
    {
        int count=0;
        count++;
        System.out.println(count);
    }
    private int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args)
    {
        arr();
        arr();
        arr();

        pract obj = new pract();
        System.out.println(obj.sum(3, 3));

        // vaisehi ob = new vaisehi();
        // int  val= ob.a;  private nhi access krega
        
    }
}
