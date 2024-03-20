package inheritance_lab_5;

public class Student extends Program{
    public void stu_id(){
        System.out.println("Student ID: 211902003");
    }
    public void prg_name() {
        super.prg_name();
        System.out.println("Program name: BSc in CSE");
    }
}
