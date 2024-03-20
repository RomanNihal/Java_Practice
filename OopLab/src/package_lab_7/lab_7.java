package package_lab_7;
import Math.*;

import java.util.Scanner;

public class lab_7 {

    public static void main(String[] args) {
        Addition a1 = new Addition();
        Subtraction a2 = new Subtraction();
        multiplication a3 = new multiplication();
        division a4 = new division();
        Scanner scan = new Scanner(System.in);
        int n;
        double a,b;
        do{
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            n = scan.nextInt();
            switch (n){
                case 1: {
                    System.out.println("Enter 1st number: ");
                    a = scan.nextDouble();
                    System.out.println("Enter 2nd number: ");
                    b = scan.nextDouble();
                    double ans = a1.add(a,b);
                    System.out.println("Answer is = "+ans);
                    break;
                }
                case 2: {
                    System.out.println("Enter 1st number: ");
                    a = scan.nextDouble();
                    System.out.println("Enter 2nd number: ");
                    b = scan.nextDouble();
                    double ans = a2.sub(a,b);
                    System.out.println("Answer is = "+ans);
                    break;
                }
                case 3: {
                    System.out.println("Enter 1st number: ");
                    a = scan.nextDouble();
                    System.out.println("Enter 2nd number: ");
                    b = scan.nextDouble();
                    double ans = a3.multi(a,b);
                    System.out.println("Answer is = "+ans);
                    break;
                }
                case 4: {
                    System.out.println("Enter 1st number: ");
                    a = scan.nextDouble();
                    System.out.println("Enter 2nd number: ");
                    b = scan.nextDouble();
                    double ans = a4.div(a,b);
                    System.out.println("Sub is = "+ans);
                    break;
                }
                default:{
                    System.out.println("Wrong input");
                    return;
                }
            }
        }while(n<=4);
    }
}
