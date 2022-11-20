import java.util.Scanner;

public class AsPattern4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {

            for (int spaces = 1; spaces < n - row; spaces++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * row; j++) {

                System.out.print((2 * row) + 1);

            }
            System.out.println();
        }
    }
}
/*
n=3
  1
 333
55555
 */
