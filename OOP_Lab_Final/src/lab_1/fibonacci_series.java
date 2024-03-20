package lab_1;

import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        int n,a=0,b=0,c=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter limit: ");
        n = scan.nextInt();
        System.out.print("Fibonacci Series: ");
        for(int i=0; i<n; i++){
            a=b;
            b=c;
            c=a+b;
            System.out.print(a + " ");
        }
    }
}
