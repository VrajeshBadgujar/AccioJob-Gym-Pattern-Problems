import java.util.Scanner;
public class characterPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int j = 65;
        for (int row = 0; row < n; row++) {
             j =65+ row;
            for (int i = 0; i <= row; i++) {
                System.out.print((char)j);
                j++;
                if(j >90){
                    j= 65;
                }
            }
            System.out.println();
        }

}}
/*
5
A
BC
CDE
DEFG
EFGHI

 */