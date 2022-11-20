import java.util.Scanner;
public class NumberPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for (int row = 1; row <= n; row++) {
            int j =row;

            for (int i = 1; i <=row ; i++) {
                System.out.print(j);
                j++;
            }
            System.out.println();
        }
}}

/*
n=3
1
23
345

 */
