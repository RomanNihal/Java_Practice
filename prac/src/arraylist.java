/*import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        s.add("Roman");
        s.add("Nihal");
        s.add("Sadik");
        System.out.println(s.get(0));
        System.out.println(s.size());
        for(int i=0; i<s.size(); i++) {
            System.out.println(s.get(i));
        }
        s.remove(2);
        for(int i=0; i<s.size(); i++) {
            System.out.println(s.get(i));
        }
        s.remove("Nihal");
        for(int i=0; i<s.size(); i++) {
            System.out.println(s.get(i));
        }
        boolean j = s.contains("Roman");
        if(j==true) {
            System.out.println("Is present");
        }
        System.out.println(s.contains("Roman"));
        System.out.println(s.contains("sadik"));
        s.clear();
        System.out.println(s.isEmpty());

    }
}*/

import java.util.ArrayList;

class student{
    String name;
    int id;
    static String dept = "CSE";
    student(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String toString(){
        return "Name: " + this.name + "\nId: " + this.id + "\nDept: " + this.dept;
    }
}
public class arraylist {
    public static void main(String[] args) {
        ArrayList<student> s = new ArrayList<>();
        s.add(new student("jhss",3));
        s.add(new student("fuguygf",4));
        for(int i=0; i<s.size(); i++) {
            System.out.println(s.get(i).toString());
        }

    }
}
