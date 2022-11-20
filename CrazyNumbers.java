import java.util.Scanner;
public class CrazyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int j=1;
        for (int row = 0; row < n; row++) {


            for (int spaces = 1; spaces < n-row; spaces++) {
                System.out.print(" ");
            }
            for (int i = 0; i <=row; i++) {
                System.out.print(j);
                j++;

                if(j>9){
                    j=1;
                }
            }


            System.out.println();
        }
}}
/*
4
    1
   23
  456
 7891

 */