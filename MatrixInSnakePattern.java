import java.util.Scanner;

public class MatrixInSnakePattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row < n; row++) {

                if(row%2==0){
                    for (int col = 0; col < n; col++) {
                    System.out.print(arr[row][col]+" ");
                }}

            if(row%2!=0){
                    for (int col = n-1; col >= 0; col--) {
                    System.out.print(arr[row][col]+" ");
                }}

        }


    }
}
