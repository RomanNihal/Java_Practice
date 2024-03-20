import java.util.ArrayList;
import java.util.Scanner;

class student2{
    String name;
    int id;
    String dept;

    student2(String a, int b, String c){
        name = a;
        id = b;
        dept = c;
    }

    @Override
    public String toString() {
        return "name= " + name + "\n" + "id= " + id + "\n" + "dept= " + dept;
    }

    public void print(String a){
        System.out.println(a + "\n" + this.id + "\n" + this.dept + "\n with string");
    }
    public void print(){
        System.out.println(this.name + "\n" + this.id + "\n" + this.dept + "\n with out string");
    }
}

public class poli {

    static void array(){
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        int b = scan.nextInt();
        scan.nextLine();
        String c = scan.nextLine();

        ArrayList<student2> s = new ArrayList<>();
        s.add(new student2(a,b,c));
        for(int i=0; i<s.size(); i++){
            System.out.println(s.get(i).toString());
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        int b = scan.nextInt();
        scan.nextLine();
        String c = scan.nextLine();
        member m1 = new member(a,b,c);
        m1.print();

        student2 m2 = new student2(a,b,c);
        m2.print(a);
        m2.print();
        array();
    }
}
