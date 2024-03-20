package file_handling;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/romannihal/Desktop/JaVa/OOP_Lab_Final/new_file2"));
        bw.write("1,2,3");
        bw.newLine();
        bw.write("2,3,4");
        bw.newLine();
        bw.write("3,4,5");
        bw.close();
//        Scanner scan = new Scanner(new BufferedReader(new FileReader("new_file2")));
        BufferedReader br = new BufferedReader(new FileReader("new_file2"));
        String s;
        int i = 0;
        int row = 3;
        int col = 3;
        int [][] mat1 = new int[row][col];
        while ((s=br.readLine())!=null){
            String[] line = s.trim().split(",");
            for(int j=0; j<line.length; j++){
                mat1[i][j]= Integer.parseInt(line[j]);
            }
            i++;
        }
        System.out.println(Arrays.deepToString(mat1));
//        while (scan.hasNextLine()){
//            for(int i=0; i<mat1.length; i++){
//                String[] line = scan.nextLine().trim().split(",");
//                for(int j=0; j<line.length; j++){
//                    mat1[i][j]= Integer.parseInt(line[j]);
//                }
//            }
//        }
        BufferedWriter bw2 = new BufferedWriter(new FileWriter("/Users/romannihal/Desktop/JaVa/OOP_Lab_Final/new_file3"));
        bw2.write("a,2,3");
        bw2.newLine();
        bw2.write("2,3,4");
        bw2.newLine();
        bw2.write("3,4,5");
        bw2.close();
        BufferedReader br2 = new BufferedReader(new FileReader("new_file3"));
        i = 0;
        int [][] mat2 = new int[row][col];
        while ((s=br2.readLine())!=null) {
            String[] line = s.trim().split(",");
            for (int j = 0; j < line.length; j++) {
                try{
                    mat2[i][j] = Integer.parseInt(line[j]);
                }
                catch (NumberFormatException e){
                    System.out.println("Fuck you");
                }
            }
            i++;
        }
        System.out.println(Arrays.deepToString(mat2));

        int c[][] = new int[mat1.length][mat2[0].length];
        for (int m = 0; m < mat1.length; m++) {
            for (int n = 0; n < mat2[0].length; n++) {
                int temp = 0;
                for (int x = 0; x < mat2.length; x++) {
                    temp += mat1[m][x] * mat2[x][n];
                }
                c[m][n] = temp;
            }
        }
        System.out.println(Arrays.deepToString(c));
    }
}
