package Lab6_GPA;
import gpa_calculator.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,ans;
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your mark: ");
            a = scan.nextDouble();
            GpaCalculator g1 = new GpaCalculator();
            ans = g1.gpa(a);
            if(ans == -1){
                System.out.println("Invalid Input");
            }
            else{
                System.out.println("Your GPA is: "+ans);
            }
        }while (a!=123);
    }
}
