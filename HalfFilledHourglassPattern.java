import java.util.Scanner;
public class HalfFilledHourglassPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstHalf = (n/2)+1;
        int secondHalf = n/2;

        for (int row = n; row >0 ; row=row/2) {

            for (int spaces = 0; spaces <n-row ; spaces++) {
                System.out.print(" ");
            }

            for (int i = 0; i <row ; i++) {
                System.out.print("*"+" ");
            }

            System.out.println();
        }

//        for (int row = secondHalf; row <=n; row=row+2) {
//
//            for (int spaces = 0; spaces <n-row ; spaces++) {
//                System.out.print(" ");
//            }
//
//            for (int i = 0; i < row; i++) {
//                System.out.print("*"+ " ");
//            }
//            System.out.println();
//        }


} }

/*
5
* * * * *
   * *
    *

 */