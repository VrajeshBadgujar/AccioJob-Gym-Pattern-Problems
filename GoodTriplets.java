import java.util.Scanner;
public class GoodTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){

            arr[i]  = sc.nextInt();
        }
        int count =0;

        for(int i=0,j=i+1,k= j+1; i<n-2; i++){

  if(((arr[i] - arr[j] <=a)||( arr[j] - arr[i] <=a))  &&  ((arr[j] - arr[k] <=b) ||( arr[k] - arr[j] <=b) ) && ((arr[i] - arr[k] <= c) || (arr[k] - arr[i] <= c))){
                        count++;
                    }
                }
        System.out.println(count);

    }}

