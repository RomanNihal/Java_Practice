package inheritance_lab_5;

public class Department extends University{
    public void dept_name(){
        System.out.println("Department name: CSE Department");
    }

    @Override
    void uni_place() {
        System.out.println("Place: American City");
    }
}
