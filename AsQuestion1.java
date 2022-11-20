import java.util.Scanner;
public class AsQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int j = n; j <=m; j++) {

            // number of digits calculation

            int copy = j;
            int i = j;
            int count = 0;

            while(copy != 0){
                int d = copy % 10;
                count++;
                copy = copy/10;
            }

            // compute sum of nth power of its digits

            long sum = 0;
            while (i != 0){
                int d = i % 10;
                sum  +=  (int)Math.pow(d,count);
                i = i/10;
            }

            // checks if number i is equal to the sum of nth power of its digits
            if(sum == j){
                System.out.println(j);
            }

        }
        
        
    }
}
