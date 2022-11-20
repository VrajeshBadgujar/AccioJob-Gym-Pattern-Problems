import java.util.Scanner;
public class RightArrowPattern {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        for (int row = 0; row < n/2; row++) {
            for (int spaces = 0; spaces < n-1; spaces++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= row; i++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*"+" ");
        }
        System.out.println();

        for (int row = (n/2)-1; row >=0 ; row--) {
            for (int spaces = 0; spaces <n-1; spaces++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= row; i++) {
                System.out.print("*"+" ");
            }
            System.out.println();

        }
        }}
/*
7
      *
      * *
      * * *
* * * * * * *
      * * *
      * *
      *

 */


