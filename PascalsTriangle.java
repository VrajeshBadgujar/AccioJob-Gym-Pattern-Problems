import java.util.Scanner;
public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {

                if((i ==j) || (j==0)){
                    arr[i][j] = 1;
                }

                else
                    arr[i][j]= arr[i-1][j-1]+ arr[i-1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {

                System.out.print( arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
//To generate A[C] in row R, sum up A'[C]
// and A'[C-1] from previous row R - 1.
/*7
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1

 */