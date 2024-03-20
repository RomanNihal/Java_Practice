import java.util.Scanner;

class student{
    private String name;
    private int id;
    private String dept;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
public class incapsulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        student s1 = new student();
        s1.setName(scan.nextLine());
        s1.setId(scan.nextInt());
        scan.nextLine();
        s1.setDept(scan.nextLine());

        System.out.println(s1.getName()+" "+s1.getId()+" "+s1.getDept());
    }
}
