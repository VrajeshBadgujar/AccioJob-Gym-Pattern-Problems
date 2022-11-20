import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for (int row = 1; row <= n; row=row+2) {
            for (int spaces = 1; spaces <= n-row; spaces++) {
                System.out.print(" ");
            }
            for (int i = 1; i <=row; i++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }

        for (int row = n-2; row >0 ; row=row-2) {
            for (int spaces = 1; spaces <= n-row; spaces++) {
                System.out.print(" ");
            }
            for (int i = 1; i <=row; i++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
}}
/*
5
    *
  * * *
* * * * *
  * * *
    *

 */