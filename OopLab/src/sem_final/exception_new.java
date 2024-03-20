package sem_final;

import java.util.InputMismatchException;
import java.util.Scanner;

class myxception extends Throwable {
    int x;
    myxception(int m){
        this.x=m;
    }

    @Override
    public String toString() {
        return "Infinity";
    }
}
public class exception_new {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n=0;
        try{
            n=scan.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Wrong input.");
            
        }
        System.out.println("Enter second number: ");
        int m=0;
        try{
            m=scan.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Wrong input");
        }
        try{
            if(m==0)
            {
                throw new myxception(m);
            }
            int ans = n/m;
            System.out.println("Ans is: "+ans);
        }
        catch (myxception e){
            System.out.println(e);
        }
    }
}
