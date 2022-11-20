import java.util.Scanner;
public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {

            for (int spaces = 0; spaces <n-row; spaces++) {
                System.out.print(" ");
            }

            int j= row;
            for (int i = j; i <=2*row-1 ; i++) {
                System.out.print(i);
                j++;
            }

            for (int k = j-2; k >=row ; k--) {
                System.out.print(k);
            }

            System.out.println();

        }

    }
}
/*
4
   1
  232
 34543
4567654

 */
