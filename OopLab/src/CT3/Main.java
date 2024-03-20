package CT3;
import calculate.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator a1 = new Calculator();
        Scanner scan = new Scanner(System.in);
        int n;
        double a,b;
        do{
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter your choice: ");
            n = scan.nextInt();
            switch (n){
                case 1: {
                    System.out.print("Enter 1st number: ");
                    a = scan.nextDouble();
                    System.out.print("Enter 2nd number: ");
                    b = scan.nextDouble();
                    double ans = a1.add(a,b);
                    System.out.println("Answer is = "+ans+"\n");
                    break;
                }
                case 2: {
                    System.out.print("Enter 1st number: ");
                    a = scan.nextDouble();
                    System.out.print("Enter 2nd number: ");
                    b = scan.nextDouble();
                    double ans = a1.sub(a,b);
                    System.out.println("Answer is = "+ans+"\n");
                    break;
                }
                case 3: {
                    System.out.print("Enter 1st number: ");
                    a = scan.nextDouble();
                    System.out.print("Enter 2nd number: ");
                    b = scan.nextDouble();
                    double ans = a1.multi(a,b);
                    System.out.println("Answer is = "+ans+"\n");
                    break;
                }
                case 4: {
                    System.out.print("Enter 1st number: ");
                    a = scan.nextDouble();
                    System.out.print("Enter 2nd number: ");
                    b = scan.nextDouble();
                    double ans = a1.div(a,b);
                    System.out.println("Sub is = "+ans+"\n");
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
