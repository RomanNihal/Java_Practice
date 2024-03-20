package sem_final;

abstract class Uni{
    public void uni_name(){
        System.out.println("Green");}
    abstract void uni_place();
}

class program extends Uni{

    @Override
    void uni_place() {
        System.out.println("American City");
    }
    public void program_name(){
        System.out.println("BSc in CSE");}
    program(){
        System.out.println("ssd");
    }
    program(int j){
        System.out.println("xxxxx");
    }

}

class department extends program{
    department(){
        System.out.println("ssss");
    }
    public void department_name(){
        System.out.println("CSE");
    }
    public void program_name(){
        super.program_name();
        System.out.println("bsc in eee");
    }


}

public class inhe {
    public static void main(String [] args){
        department d = new department();
        d.uni_name();
        d.uni_place();
        d.program_name();
        d.department_name();
    }
}
