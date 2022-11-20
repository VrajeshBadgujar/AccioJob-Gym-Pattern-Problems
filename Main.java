import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstHalf = (n/2)+1;
        int secondHalf = n/2;

        for (int row = n; row >0 ; row--) {
            System.out.print("*"+ " ");
        }
        System.out.println();

        for (int j = 2; j < n; j=j+2) {

            for (int spaces = 0; spaces <j ; spaces++) {
                System.out.print(" ");
            }

            for (int star = 0; star < 1; star++) {
                System.out.print("*");
            }
        }

//            back star
//            int z = n-3;
//            for (int spaces =0 ; spaces <n-3 ; spaces++) {
//                System.out.print(" ");
//                z=z-2;
//
//            for (int star = 0; star < 1; star++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }





}}
