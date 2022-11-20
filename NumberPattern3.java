import java.util.Scanner;
public interface NumberPattern3 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 0; row < n; row++) {

//            print first 1
            for (int i = 0; i <= 0; i++) {
                System.out.print(1);
            }

//            print 2
            for (int i = 2; i <=row ; i++) {
                System.out.print(2);
            }

//           print last 1
            for (int i = 1; i <=row ; i++) {
                System.out.print(1);
                break;
            }
            System.out.println();
        }

    }
}
/* 7
1
11
121
1221
12221
122221
1222221


 */