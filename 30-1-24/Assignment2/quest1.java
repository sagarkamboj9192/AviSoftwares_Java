import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class quest1 {
    public static void main(String[] args)
    {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for(int i=0;i<n;i++){
            ls.add(obj.nextInt());
        }

        Vector<Vector<Integer>> vec =new Vector<Vector<Integer>>();

        System.out.print("Enter the target element: ");
        int target=obj.nextInt();
        // for (int i = 0; i < ls.size() - 2; i++) {
        //     for (int j = i + 1; j < ls.size() - 1; j++) {
        //         for (int k = j + 1; k < ls.size(); k++) {
        //             if (ls.get(i) + ls.get(j) + ls.get(k) == target) {
        //                 Vector<Integer> ans = new Vector<>();
        //                 ans.add(ls.get(i));
        //                 ans.add(ls.get(j));
        //                 ans.add(ls.get(k));
                        
        //                 ans.sort(null);

        //                 if (!vec.contains(ans)) {
        //                     vec.add(ans);
        //                 }
        //             }
        //         }
        //     }
        // }

        // or...
        ls.sort(null);
        for(int i=0;i<n;i++)
        {
            if(i>0 && ls.get(i) == ls.get(i-1)){
                continue;
            }
            int j=i+1;
            int k=ls.size()-1;
            while (j< k) {
                int sum=ls.get(i)+ls.get(j)+ls.get(k);
                if(sum< target){
                    j++;
                }
                else if(sum > target){
                    k--;
                }
                else{
                    Vector<Integer> ans = new Vector<>();
                    ans.add(ls.get(i));
                    ans.add(ls.get(j));
                    ans.add(ls.get(k));
                    vec.add(ans);
                    j++;
                    k--;
                    while(j<k && ls.get(j) == ls.get(j-1)){
                        j++;
                    }
                    while(j<k && ls.get(k) == ls.get(k+1)){
                        k--;
                    }

                }
            }
        }
        
        if(vec.size() == 0){
            System.out.println(-1);
        }
        else{
            for(Vector<Integer> i:vec){
                for(int j: i){
                    System.out.print(j);
                }
                System.out.println(" ");
            }
        }
        obj.close();
    }
}
