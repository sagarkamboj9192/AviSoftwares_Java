
import java.util.Arrays;
import java.util.HashMap;

import java.util.Vector;

public class Group_anagrams {
    Vector<Vector<String>> group_anag(String[] arr)
    {
        Vector<Vector<String>> ans = new Vector<>();
        
        HashMap<String , Vector<String>> mp = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {

            char[] chars = arr[i].toCharArray();
            Arrays.sort(chars);
            
            String sortedStr = new String(chars);
            if (!mp.containsKey(sortedStr)){

                mp.put(sortedStr, new Vector<>());
                // new Vector<>(mp.values());
            }
            
            mp.get(sortedStr).add(arr[i]);         
        
        }

        for (Vector<String> it : mp.values()) {
            ans.add(it);
        }

        return ans;
    }

    
    public static void main(String[] args) {
        
        
        String[] arr= new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        

        Group_anagrams obj = new Group_anagrams();
        Vector<Vector<String>> ans = new Vector<>();
        ans = obj.group_anag(arr);
        for(Vector<String> it: ans){
            System.out.print(it+" ");
        }
    }
}
