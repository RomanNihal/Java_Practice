package sem_final;

import java.util.Scanner;

class myException extends Exception {
    int x;
    public myException(int n) {
        this.x=n;
    }

    @Override
    public String toString() {
        return "error" + x;
    }
}

public class exception_handling {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        try{
            if(n>9){
                throw new myException(n);
            }
            System.out.println(n);

        } catch (myException e) {
            System.out.println(e);
        }
    }
}
