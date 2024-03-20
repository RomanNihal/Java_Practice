package User_Exception;

import java.util.Scanner;
class My_exception extends Exception{
    int a;
    My_exception(int n){
        this.a=n;
    }

    @Override
    public String toString() {
        return "My_exception{" +
                "a=" + a +
                '}';
    }
}
public class exception_handling {
    public static void cal(int a) throws My_exception{
        if(a>9){
            throw new My_exception(a);
        }
        else{
            System.out.println("Normal");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter a number below 10: ");
        n = scan.nextInt();
        try{
            cal(n);
            cal(1);
            cal(13);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
