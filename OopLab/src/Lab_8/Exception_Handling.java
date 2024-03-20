package Lab_8;

import java.util.Scanner;

class AgeOutOfRangeException extends Exception{
    int age;
    public AgeOutOfRangeException(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "You are older than the requested age(25 year), you are "+age+"!!!";
    }
}
class LowGpaException extends Exception{

    public LowGpaException(){
    }
    @Override
    public String toString() {
        return "Your GPA is not sufficient to apply for this job (2.5)";
    }
}

public class Exception_Handling {
    public static void main(String[] args) {
        int flag = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        System.out.print("Enter your GPA: ");
        double gpa = scan.nextDouble();
        try {
            if (age > 25) {
                throw new AgeOutOfRangeException(age);
            }
            else{
                flag = 0;
            }
        }
        catch(AgeOutOfRangeException e){
            System.out.println(e);
        }
        try{
            if(gpa < 2.5){
                flag = 1;
                throw new LowGpaException();
            }
            else if(gpa > 4){
                flag = 1;
                System.out.println("Invalid GPA");
            }
            else{
                if(flag == 0){
                    flag = 0;
                }
            }
        }
        catch (LowGpaException e){
            System.out.println(e);
        }
        if(flag == 0){
            System.out.println("Your application is accepted and is in study.");

        }
    }
}
