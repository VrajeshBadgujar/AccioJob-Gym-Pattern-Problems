import java.util.Scanner;
public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int copy = n;
        int rev = 0;
        while(n !=0){
            int d = n % 10;
            rev  = rev *10 +d;
            n = n  /10;
        }
        if(copy == rev)
            System.out.println();

    }}
