import java.util.Scanner;
public class BinaryPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 0; row <n ; row++) {

            for (int i = 0; i <n-row ; i++) {

               if(row %2 == 0){
                   System.out.print(1);
               }
               else{
                   System.out.print(0);
               }
            }
            System.out.println();

        }

    }}
