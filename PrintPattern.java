import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int row=1; row<=n; row++){

            for(int spaces = 1; spaces<=n-row; spaces++){
                System.out.print(" ");
            }
            for(int j=1; j<2*row; j++){

                System.out.print(row);

            }
            System.out.println();

        }
    }
}
/*
n=5
    1
   222
  33333
 4444444
555555555
 */