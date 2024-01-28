import java.util.Vector;

public class ques4 {
    public static void main(String[] pra)
    {
        int n=12;
        if(n<4){
            System.out.println(-1);
        }

        Vector<Integer> vec = new Vector<Integer>();

        for(int i=2;i<=n/2;i++){
            if(n%i == 0){
                vec.add(i);
            }
        }

        if(vec.size() > 0){
            System.out.println(vec);
        }
        else{
            System.out.println(-1);
        }
    }
}
