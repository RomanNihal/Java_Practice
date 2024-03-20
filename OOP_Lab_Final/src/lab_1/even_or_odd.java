package lab_1;

import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scan.nextInt();
        if(n % 2 == 0){
            System.out.println("This is an even number.");
        }
        else{
            System.out.println("This is an odd number.");
        }
    }
}
