import java.util.Scanner;

class a{
    int x;
    public int ktc(){
        return 3*this.x;
    }
    public void pr(){
        System.out.println(this.x);
    }
}
class b extends a{
    float y;
    public float ktcc(){
        return (float) ktc()*this.y;
    }
    public void ps(){
        System.out.println(this.y);
        pr();
    }
}
class c extends b{
    int z;
    public float ktccc(){
        return (float) ktcc()*this.z;
    }
    public void pt(){
        System.out.println(this.z);
        ps();
    }
}

public class prac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        a A = new a();
        System.out.println("Give a value: ");
        A.x = scan.nextInt();
        b B = new b();
        System.out.println("Give 2 values: ");
        B.x = scan.nextInt();
        B.y = scan.nextInt();
        c C = new c();
        System.out.println("Give 3 values: ");
        C.x = scan.nextInt();
        C.y = scan.nextInt();
        C.z = scan.nextInt();
        A.pr();
        B.ps();
        C.pt();
        System.out.println(C.ktccc());
    }
}

/*
import java.util.Scanner;

class circle {
    int radius;
    public float area()
    {
        return (float) Math.PI*this.radius*this.radius;
    }
}

class cylinder extends circle {
    int height;
    public float volume()
    {
        return this.height*this.area();
    }
}
public class prac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        cylinder x = new cylinder();
        System.out.println("Enter radius: ");
        x.radius = scan.nextInt();
        System.out.println("Enter height: ");
        x.height = scan.nextInt();
        System.out.println(x.area());
        System.out.println(x.volume());
    }
}
*/