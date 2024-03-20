package sem_final;

import java.util.Scanner;

class AgeOut extends Exception{
    int age;
    AgeOut(int x){this.age = x;}
    public String toString(){
        return "age is not applicable " + age;}
}

class GPAOut extends Exception{
    double g;
    GPAOut(double x){this.g = x;}
    public String toString(){
        if(g>4){return "Invalid GPA " + g;}
        else{return "Low GPA " + g;}
    }
}

public class age_gpa_out_of {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        double GPA = 0;
        int Age = 0;
        System.out.println("Enter your age: ");
        Age = scan.nextInt();
        System.out.println("Enter your GPA: ");
        GPA = scan.nextDouble();
        try{
            if(Age>18){ throw new AgeOut(Age);}
            System.out.println("Age = " + Age);
        }
        catch(AgeOut e){
            System.out.println(e);}
        try{
            if(GPA<2.5 || GPA>4){ throw new GPAOut(GPA);}
            System.out.println("GPA = "+GPA);
        }
        catch(GPAOut e){
            System.out.println(e);}
    }
}
