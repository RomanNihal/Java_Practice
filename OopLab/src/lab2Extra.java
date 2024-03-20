import java.util.Scanner;

public class lab2Extra {
    public static void main(String[] args) {
        int r,g,b;
        System.out.println("Enter 1 for on and 0 for off");
        Scanner scan = new Scanner(System.in);
        System.out.print("Red - ");
        r = scan.nextInt();
        System.out.print("Green - ");
        g = scan.nextInt();
        System.out.print("Blue - ");
        b  = scan.nextInt();
        int color = ((100*r)+(10*g)+b);
        switch (color){
            case 100:
                System.out.println("RED");
                break;
            case 010:
                System.out.println("Green");
                break;
            case 001:
                System.out.println("Blue");
                break;
            case 110:
                System.out.println("Yellow");
                break;
            case 101:
                System.out.println("Magenta");
                break;
            case 011:
                System.out.println("Cyan");
                break;
            case 111:
                System.out.println("White");
                break;
            case 000:
                System.out.println("No color");
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
    }
}
