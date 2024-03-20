import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilePrac {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/romannihal/Desktop/JaVa/OopLab", "Shohel");
        FileWriter fw = new FileWriter("Shohel");
        FileReader fr = new FileReader("Shohel");
        fw.write("My name is roman nihal");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        for(int i=0; i<s.length(); i++){
            fw.write(s.charAt(i));
        }
        fw.close();
        int c;
//        while((c=fr.read())!=-1){
//            System.out.print((char)c);
//        }
        char ch;
        for(int i=0; i<f.length(); i++){
            ch=(char)fr.read();
            System.out.print(ch);
        }
        fr.close();
    }
}
