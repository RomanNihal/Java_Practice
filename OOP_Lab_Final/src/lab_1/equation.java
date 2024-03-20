package lab_1;

import java.util.Scanner;

public class equation {
    public static void main(String[] args) {
        int n,x;
        float sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter limit: ");
        n = scan.nextInt();
        System.out.print("Enter the value of x: ");
        x = scan.nextInt();
        for(int i=2; i<=n; i+=2){
            sum = (float) (sum+Math.pow(x,i))/fact(i-1);
        }
        System.out.println("Sum of the equation is = "+sum);
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
