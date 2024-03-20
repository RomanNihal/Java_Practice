package inheritance_lab_5;

public class Club extends University{
    public void club_name(){
        System.out.println("Club name: Computer club");
    }

    @Override
    void uni_place() {
        System.out.println("Place: American City");
    }
}
