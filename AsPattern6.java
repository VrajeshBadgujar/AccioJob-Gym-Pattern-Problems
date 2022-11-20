import java.util.Scanner;
public class AsPattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for (int row = 0; row < n+1; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print(" ");
            }
            for (int i = 0; i <=row; i++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for (int row = n-1; row >= 0; row--) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print(" ");
            }
            for (int i = 0; i <=row; i++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }}
/*
4
    *
   * *
  * * *
 * * * *
* * * * *
* * * * *
 * * * *
  * * *
   * *
    *

 */