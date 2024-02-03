import java.util.Scanner;

public class setmatrix0
{
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
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         arr[i][j] = Long.valueOf(arr[i][j]);
        //     }
        // }

        Long z = Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(arr[i][j] == 0){
                    for(int k=0;k<m;k++){
                        if(arr[i][k] != 0){
                            arr[i][k] = Integer.MIN_VALUE;
                        }
                    }
                    for(int k=0;k<n;k++){
                        if(arr[k][j] != 0){
                            arr[k][j] = Integer.MIN_VALUE;
                        }
                    }
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == Integer.MIN_VALUE){
                    arr[i][j] = 0;
                }
            }
        }

        System.out.println("New modified array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}