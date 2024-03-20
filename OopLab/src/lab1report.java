import java.util.Scanner;

public class lab1report {
    public static void main(String[] args) {

        //even odd

        /*int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scan.nextInt();
        if(num%2==0){
            System.out.println(num + " is a even number");
        }
        else{
            System.out.println(num + " is a odd number");
        }*/

        //factorial odd number series

        /*int x,n;
        float sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value: ");
        x = scan.nextInt();
        System.out.print("Enter the limit: ");
        n = scan.nextInt();
        for(int i=2; i<=n; i=i+2){
            sum = (float) (sum+ (Math.pow(x,i)/fact(i-1)));
        }
        System.out.println("Sum = "+sum);

    }
    public static int fact(int n){
        if(n>=1){
         return n*fact(n-1);
        }
        else{
            return 1;
        }*/

        int num,sum=0,odd=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        num = scan.nextInt();
        for(int i=0; i<num; i++){
            sum = sum+fact(odd);
            odd = odd+2;
        }
        System.out.println("Sum = "+sum);

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
