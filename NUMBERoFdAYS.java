import java.util.Scanner;
public class NUMBERoFdAYS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int days = 0;

        if(m==2){
            days = 28;
        }

        if(m != 2 && m <8){

            if(m%2==0){
                days =30;
            }
            else{
                days =31;
            }
        }

        if(m >=8){
            if(m%2==0){
                days =31;
            }
            else{
                days =30;
            }
        }

        System.out.println(days);
    }
}
