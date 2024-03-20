import java.util.Scanner;

class Calculate{
    double base;
    double height;
    double length;
    double width;
    double radius;
    Calculate(double b, double h, double half){
        double area = half*b*h;
        System.out.println("The area of the triangle is = "+area+"\n");
    }
    Calculate(double l, double w){
        double area = l*w;
        System.out.println("The area of the rectangle is = "+area+"\n");
    }
    Calculate(double r){
        double area = Math.PI*r*r;
        System.out.println("The area of the circle is = "+area+"\n");
    }
}
public class lab2 {
    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("1. Area of triangle.");
            System.out.println("2. Area of rectangle.");
            System.out.println("3. Area of circle.");
            System.out.print("Enter your choice: ");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    double b, h, half = 0.5;
                    System.out.print("Enter base: ");
                    b = scan.nextDouble();
                    System.out.print("Enter height: ");
                    h = scan.nextDouble();
                    Calculate c1 = new Calculate(b, h, half);
                    break;
                case 2:
                    double l, w;
                    System.out.print("Enter length: ");
                    l = scan.nextDouble();
                    System.out.print("Enter width: ");
                    w = scan.nextDouble();
                    Calculate c2 = new Calculate(l, w);
                    break;
                case 3:
                    double r;
                    System.out.print("Enter radius: ");
                    r = scan.nextDouble();
                    Calculate c3 = new Calculate(r);
                    break;
                default:
                    System.out.println("Wrong input.");
            }
        }while(choice<=4);
    }
}