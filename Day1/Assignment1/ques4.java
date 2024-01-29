import java.util.*;

public class ques4 {
    public static void main(String[] pra)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number to calculate factor: ");
        int n = obj.nextInt();

        if(n<4){
            System.out.println(-1);
        }
        else{
            int val = (int) Math.sqrt(n);
            Vector<Integer> vec = new Vector<Integer>();
            for(int i=2;i<=val;i++){
                if(n%i == 0 ){
                    int ans=(int) n/i;
                    vec.add(i);
                    if(ans!= i){
                        vec.add(ans);
                    }
                    
                }
            }

            if(vec.size() > 0){
                System.out.println(vec);
            }
            else{
                System.out.println(-1);
            }
        }
        obj.close();
        
    }
}
