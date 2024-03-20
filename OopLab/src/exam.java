import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        switch (n){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Others");
        }
    }
}
