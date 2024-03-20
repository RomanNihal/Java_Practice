import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab3FileHandling {
    public static void main(String[] args) throws IOException {
        String s = "My name is Roman Nihal.";
        String s2 = "I am a student of CSE dept.";

        File f = new File("/Users/romannihal/Desktop/JaVa/OopLab","file_1");
        File f2 = new File("/Users/romannihal/Desktop/JaVa/OopLab", "file_2");
        File f3 = new File("/Users/romannihal/Desktop/JaVa/OopLab", "file_3");
        FileWriter fw = new FileWriter("file_1");
        FileWriter fw2 = new FileWriter("file_2");
        FileWriter fw3 = new FileWriter("file_3");
        FileReader fr = new FileReader("file_1");
        FileReader fr2 = new FileReader("file_2");
        FileReader fr3 = new FileReader("file_3");
        for(int i=0; i<s.length(); i++){
            fw.write(s.charAt(i));
        }
        for(int i=0; i<s2.length(); i++){
            fw.append(s2.charAt(i));
        }
        fw.close();
        fw2.write("My ID is 211902003.");
        fw2.close();
//        if(f2.exists()){
//            System.out.println("File name: " + f2.getName());
//            System.out.println("File path: " + f2.getPath());
//            System.out.println("File length: " + f2.length());
//            System.out.println("File name: " + f2.canWrite());
//            System.out.println("File name: " + f2.canRead());
//        }
        char c;
        String str="";
        for(int i=0; i<f.length(); i++){
            c = (char) fr.read();
            str = str + c;
        }
        fr.close();
        for(int i=0; i<f2.length(); i++){
            c = (char) fr2.read();
            str = str + c;
        }
        fr2.close();
        for(int i=0; i<str.length(); i++){
            fw3.write(str.charAt(i));
        }
        fw3.close();
        for(int i=0; i<f3.length(); i++){
            c = (char) fr3.read();
            System.out.print(c);
        }
        fr3.close();
    }
}