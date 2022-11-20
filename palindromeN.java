import java.util.Scanner;
public class palindromeN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {

            int copy = i;
            int j = i;
            int rev = 0;

            while(j !=0){
                int d = j % 10;
                rev  = rev *10 +d;
                j = j  /10;
            }
            if(copy == rev)
                System.out.println(i+" ");
        }

    }
}
