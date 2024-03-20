package calculate;

public class Calculator {
    public double add(double a, double b){
        double c = a+b;
        return c;
    }
    public double sub(double a, double b){
        double c = a-b;
        return c;
    }
    public double multi(double a, double b){
        double c = a*b;
        return c;
    }
    public double div(double a, double b){
        double c = a/b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println("This is an user-defined package");
    }
}
