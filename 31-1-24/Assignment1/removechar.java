import java.util.Scanner;

public class removechar {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();

        System.out.print("Enter the character : ");
        char c = obj.next().charAt(0);
        char[] arr = s.toCharArray();
        int i=0; int index=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j] != c){
                arr[index++]=arr[j];
                i++;
            }
        }
        for(int j=index;j<arr.length;j++)
        {
            arr[index]='\0';
        }

        // for(int j=0;j<arr.length;j++)
        // {
        //     System.out.println(arr[j]);
        // }
        
        System.out.println(arr);
    }
}
