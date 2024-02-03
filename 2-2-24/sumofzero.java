import java.util.Scanner;

public class sumofzero {
    public static void main(String[] args)
    {
        System.out.print("Enter n: ");
        Scanner obj = new Scanner(System.in);
        int n= obj.nextInt();
        System.out.print("Enter m: ");
        int m = obj.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=obj.nextInt();
            }
        }


        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j] == 0){
                    if(j+1<m && arr[i][j+1] == 1){
                        count++;
                    }
                    if(j-1 >=0 && arr[i][j-1] == 1){
                        count++;
                    }
                    if(i+1 <n && arr[i+1][j] == 1){
                        count++;
                    }
                    if(i-1 >=0 && arr[i-1][j] == 1){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        obj.close();
    }
        
}
