package Assignment;

public class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a,b);
    }
    double area(){
        return dim1 * dim2;
    }
    int compareTo(Figure X){
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
