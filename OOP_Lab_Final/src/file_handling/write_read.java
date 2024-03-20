package file_handling;

import java.io.*;
import java.util.Scanner;

public class write_read {
    public static void main(String[] args) throws IOException {
//        File f = new File("/Users/romannihal/Desktop/JaVa/OOP_Lab_Final","new_file1");
//        FileWriter fw = new FileWriter("new_file1");
//        FileReader fr = new FileReader("new_file1");
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/romannihal/Desktop/JaVa/OOP_Lab_Final/new_file1"));
        BufferedReader br = new BufferedReader(new FileReader("/Users/romannihal/Desktop/JaVa/OOP_Lab_Final/new_file1"));
        Scanner scan = new Scanner(System.in);
        bw.write(scan.nextLine()+"\n");
        bw.write("211902003\n");
        bw.write("gsgsgs\n");
        bw.write("ajdcddc\n");
        bw.close();
        String read;
//        read = br.readLine();
        while((read = br.readLine())!=null){
            System.out.println(read);
        }
        br.close();

    }
}
