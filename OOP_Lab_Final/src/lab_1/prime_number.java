package lab_1;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        int n, flag = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scan.nextInt();
        for(int i = 2; i<n; i++){
            if(n % i == 0){
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("The number is a prime number.");
        }
        else{
            System.out.println("The number isn't a prime number.");
        }
    }
}
