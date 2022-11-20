import java.util.Scanner;
public class PrintThePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        for (int row = 0; row < n; row++) {
            for (int i = 0; i <=row ; i++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
