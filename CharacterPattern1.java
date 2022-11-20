import java.util.Scanner;
public class CharacterPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for (int row = 0; row < n; row++) {
            for (int i = 0; i <=row ; i++) {
                System.out.print((char) (65+row));
            }
            System.out.println();
        }
}}
/*
4
A
BB
CCC
DDDD
 */