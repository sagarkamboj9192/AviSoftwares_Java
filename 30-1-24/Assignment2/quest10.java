import java.util.ArrayList;
import java.util.Scanner;

public class quest10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ls.add(sc.nextInt());
        }

        for(int i=0;i<ls.size()-1;i++){
            for(int j=i+1;j<ls.size();j++)
            {
                if(ls.get(j) < ls.get(i)){
                    int temp=ls.get(i);
                    ls.set(i, ls.get(j));
                    ls.set(j, temp);
                }
            }
        }

        for(int i:ls){
            System.out.print(i+" ");
        }
        sc.close();

    }
}
