import java.util.Scanner;

class student1{
    String name;
    int id;
}
class member extends student1{
    String dept;

    member(String a, int b, String c){
        name = a;
        id = b;
        dept = c;
    }
    public void print(){
        System.out.println(this.name + "\n" + this.id + "\n" +this.dept + "\n inhari");
    }
}

public class inhari {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        /*member m1 = new member();
        m1.name = s.nextLine();
        m1.id = s.nextInt();
        s.nextLine();
        m1.dept = s.nextLine();
        m1.print();*/

        String e = s.nextLine();
        int f = s.nextInt();
        s.nextLine();
        String g = s.nextLine();
        member m2 = new member(e,f,g);
        m2.print();


    }
}
