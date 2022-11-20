import java.util.Scanner;
public class Patternify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for (int row = n; row > 0; row--) {

            for (int i = 0; i < row; i++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
