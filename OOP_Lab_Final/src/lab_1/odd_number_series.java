package lab_1;

import java.util.Scanner;

public class odd_number_series {
    public static void main(String[] args) {
        int n,sum=0,odd=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter limit: ");
        n = scan.nextInt();
        for(int i=0; i<n; i++){
            sum = sum+fact(odd);
            odd+=2;
        }
        System.out.println("Summation of odd number series = "+sum);
    }
    public static int fact(int n){
        if(n>=1){
            return n*fact(n-1);
        }
        else{
            return 1;
        }
    }
}
