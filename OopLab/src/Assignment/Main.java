package Assignment;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,6);
        Rectangle r2 = new Rectangle(4,8);
        Triangle t1 = new Triangle(7,6);
        Triangle t2 = new Triangle(9,4);

        double ans,rcmp,tcmp;
        ans = r1.area();
        System.out.println("Area of the Rectangle is: "+ans);
        ans = r2.area();
        System.out.println("Area of the Rectangle is: "+ans);
        ans = t1.area();
        System.out.println("Area of the Triangle is: "+ans);
        ans = t2.area();
        System.out.println("Area of the Triangle is: "+ans);

        rcmp = r2.compareTo(r1);
        if(rcmp == 0){
            System.out.println("Rectangle objects are equal");
        }
        if(rcmp == 1){
            System.out.println("Invoking rectangle object is larger");
        }
        if(rcmp == -1){
            System.out.println("Invoking rectangle object is smaller");
        }

        tcmp = t2.compareTo(t1);
        if(tcmp == 0){
            System.out.println("Triangle objects are equal");
        }
        if(tcmp == 1){
            System.out.println("Invoking triangle object is larger");
        }
        if(tcmp == -1){
            System.out.println("Invoking triangle object is smaller");
        }
    }
}
