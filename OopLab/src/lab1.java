import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {

        //prime number

        /*int num;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        for(int i=2; i<num; i++){
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }*/

        //fibonacci series

        /*int num;
        int a=0,b=0,c=1;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        for(int i=0; i<num; i++){
            a=b;
            b=c;
            c=a+b;
            System.out.println(a);
        }*/

        //factorial

        int num,sum=0;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        for(int i=0; i<=num; i++){
            sum=sum+fact(i);
        }
        System.out.println(sum);

    }

    public static int fact(int n){
        if (n>=1)
            return n*fact(n-1);
        else
            return 1;
    }
}
