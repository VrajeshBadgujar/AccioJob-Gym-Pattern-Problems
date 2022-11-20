import java.util.Scanner;
public class AsPattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int n= ch;

        for (int row = 65; row <=n ; row++) {

            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print(" ");
            }

            for (int i = 65; i <=row ; i++) {
                System.out.print((char)i );
            }

            System.out.println();
        }
} }
/*
F
     A
    AB
   ABC
  ABCD
 ABCDE
ABCDEF

 */