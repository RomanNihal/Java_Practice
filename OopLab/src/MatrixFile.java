import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixFile {
    public static void main(String[] args) throws IOException {
        File mat = new File("/Users/romannihal/Desktop/JaVa/OopLab", "Matrix_1");
        BufferedWriter fw = new BufferedWriter(new FileWriter("Matrix_1"));
        String s = "3,2,4,7,1,5";
        String s1 = "0,7,8,6,1,9";
        for(int i=0; i<s.length(); i++){
            fw.write(s.charAt(i));
        }
        for(int i=0; i<s.length(); i++){
            fw.newLine();
            fw.write(s1.charAt(i));
        }
        fw.close();
        Scanner scan = new Scanner(new BufferedReader(new FileReader("Matrix_1")));
        int row =2;
        int col=8;
        int[][] array1 = new int[row][col];
        while(scan.hasNextLine()){
            for (int i=0; i<array1.length; i++) {
                String[] line = scan.nextLine().trim().split(",");
                for (int j=0; j<line.length; j++) {
                    array1[i][j] = Integer.parseInt(line[j]);
                }
            }
        }
        System.out.println(Arrays.deepToString(array1));
        System.out.println("\n");

        File mat2 = new File("/Users/romannihal/Desktop/JaVa/OopLab", "Matrix_2");
        BufferedWriter fw2 = new BufferedWriter(new FileWriter("Matrix_2"));
        String s2 = "4,2,5,1,7,4,3,8";
        for(int i=0; i<s2.length(); i++){
            fw2.write(s2.charAt(i));
        }
        fw2.close();
        Scanner scan2 = new Scanner(new BufferedReader(new FileReader("Matrix_2")));
        int row2 =1;
        int col2=8;
        int[][] array2 = new int[row2][col2];
        while(scan2.hasNextLine()){
            for (int i=0; i<array2.length; i++) {
                String[] line2 = scan2.nextLine().trim().split(",");
                for (int j=0; j<line2.length; j++) {
                    array2[i][j] = Integer.parseInt(line2[j]);
                }
            }
        }
        System.out.println(Arrays.deepToString(array2));
        System.out.println("\n");

        int c[][] = new int[array1.length][array2[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                int temp = 0;
                for (int x = 0; x < array2.length; x++) {
                    temp += array1[i][x] * array2[x][j];
                }
                c[i][j] = temp;
            }
        }
//        System.out.println(Arrays.deepToString(c));

        File mat3 = new File("/Users/romannihal/Desktop/JaVa/OopLab", "Matrix_3");
        BufferedWriter fw3 = new BufferedWriter(new FileWriter("Matrix_3"));
        for (int i = 0; i <c.length; i++) {
            for (int j = 0; j <c[i].length; j++) {
                fw3.write(c[i][j] + ",");
            }
            fw3.newLine();
        }
        fw3.close();
        char ch;
        BufferedReader fr = new BufferedReader(new FileReader("Matrix_3"));
        for(int i=0; i<mat3.length(); i++){
            ch = (char) fr.read();
            System.out.print(ch);
        }
        fr.close();
    }
}
