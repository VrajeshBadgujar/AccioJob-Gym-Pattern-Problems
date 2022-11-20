/*      n=7
              *
             * *
            * * *
           * * * *
          * * * * *
         * * * * * *
        * * * * * * *

        */
import java.util.Scanner;

public class starOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {

            for (int spaces = 1; spaces <= n-i; spaces++) {

                System.out.print(" ");
            }

            for (int star = 1; star <= i; star++) {

                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
