import java.util.Scanner;

class fraction{
    int nu;
    int deno;
    fraction(int a,int b){
        nu=a;
        deno=b;
    }
    fraction(){
        nu=1;
        deno=1;
    }
    double  instance(){
        Scanner scan = new Scanner(System.in);
        int d,e;
        d = scan.nextInt();
        e = scan.nextInt();
        return (this.nu*d)/(this.deno*e);
    }
}
public class exam2 {
    public static void main(String[] args) {
        fraction f1=new fraction(2,3);
        double s1 = f1.instance();
        System.out.println(s1);
        System.out.println(f1.toString());
    }
}
