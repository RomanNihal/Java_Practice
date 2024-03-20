/*
import java.util.Scanner;

class info{
    String name;
    int id;
    String dept;
    info(String name,int id,String dept){
        this.name = name;
        this.id = id;
        this.dept = dept;
    }
}

public class inharitence {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int z;
        String x,y;
        x = scan.nextLine();
        z = scan.nextInt();
        scan.nextLine();
        y = scan.nextLine();
        info g = new info(x,z,y);
        System.out.println(g.name+g.id+g.dept);
    }
}
*/

public class inharitence {
    public static void main(String[] args){
        boolean b = true;
        int a = 2;
        if(a==2==b) {
            System.out.println(b);
        }
    }
}