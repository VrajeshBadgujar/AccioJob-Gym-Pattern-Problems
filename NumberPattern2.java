import java.util.Scanner;

public class NumberPattern2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {

            for (int i = row; i >=1 ; i--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
/*
5

1
21
321
4321
54321

 */