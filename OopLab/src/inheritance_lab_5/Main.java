package inheritance_lab_5;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.stu_id();
        s1.prg_name();
        s1.dept_name();
        s1.Uni_name();
        s1.uni_place();

        Teacher t1 = new Teacher();
        t1.tech_name();
        t1.dept_name();
        t1.Uni_name();
        t1.uni_place();

        Club c1 = new Club();
        c1.club_name();
        c1.Uni_name();
        c1.uni_place();
    }
}