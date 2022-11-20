import java.util.Scanner;
public class AsPattern3 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        char n = sc.next().charAt(0);
        int start= n;

        for (int row = start; row >=65; row--) {
            for (int i = 65; i <= row; i++) {
                System.out.print((char)row + " ");
            }
            System.out.println();
        }

}}
/*
D
D D D D
C C C
B B
A

 */