import java.util.Arrays;
import java.util.Scanner;

public class theory1 {
    public static void main(String[] args) {
        /*int R,G,B;
        System.out.println("Press 1 for on and 0 for off: ");
        Scanner scan = new Scanner(System.in);
        R = scan.nextInt();
        G = scan.nextInt();
        B = scan.nextInt();

        int sum = R+(10*G)+(100*B);
        switch (sum){
            case 100:
                System.out.println("RED");
                break;
            case 010:
                System.out.println("Green");
                break;
            case 001:
                System.out.println("Blue");
                break;
            default:
                System.out.println("Wrong");
                break;
        }*/

        Scanner scan = new Scanner(System.in);
        int a[][] = new int[3][4];
        int b[][] = new int[3][4];
        int sum[][] = new int[3][4];
        System.out.println("Input a 3 by 4 matrix: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                a[i][j]= scan.nextInt();
            }
        }
        System.out.println("Input another 3 by 4 matrix: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                b[i][j]= scan.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum of the two matrix: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
