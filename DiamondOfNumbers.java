import java.util.Scanner;
public class DiamondOfNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int backNum = 0;
        int firstHalf = (n/2)+1;
        int secondHalf = n/2;

        for(int row=1; row<=firstHalf; row++){

            for(int spaces=1; spaces<=firstHalf-row; spaces++){
                System.out.print(" ");
            }

            for(int j=1; j<=row; j++){

                System.out.print(j);
                backNum = j;

            }

            for(int back=backNum+1;  back<row+backNum; back++){

                System.out.print(back);
            }

            System.out.println();
        }

        for(int row=secondHalf;  row>0;  row--){

            for(int spaces=0; spaces<=secondHalf-row; spaces++){
                System.out.print(" ");
            }

            for(int j=1; j<=row; j++){

                System.out.print(j);
                backNum = j;
            }
            for(int back=backNum+1;  back<row+backNum; back++){

                System.out.print(back);
            }

            System.out.println();
        }

    }}


/* 7
           1
          123
         12345
        1234567
         12345
          123
           1


 */