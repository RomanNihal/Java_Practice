package assignment;

public class Rectangle implements Figure{
    double dim1;
    double dim2;
    Rectangle(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    public double area(){
        return dim1 * dim2;
    }
    public int compareTo(Figure X){
        if(this.area() == X.area()){
            return 0;
        }
        if(this.area() > X.area()){
            return 1;
        }
        if(this.area() < X.area()){
            return -1;
        }
        return 0;
    }
}
