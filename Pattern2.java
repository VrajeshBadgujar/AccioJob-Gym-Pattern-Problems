import java.util.Scanner;
public class Pattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int j=1;
        for (int row = 0; row < n; row++) {
            for (int i = 0; i <= row; i++) {
                System.out.print(j);
                j++;
            }
            System.out.println();
        }
} }
