package sem_final;

import java.io.IOException;
import java.nio.CharBuffer;

class myTask1 extends Thread{
    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println("sOut 1");
        }
    }
}
class exp {

}
class myTask2 extends exp implements Runnable{

    int z;
    myTask2(int x){
        this.z = x;
    }
    @Override
    public void run() {
        for(int i=0; i<z; i++){
            System.out.println("run 1");
        }
    }
}

public class prac_thread {
    public static void main(String[] args) {
        myTask1 m = new myTask1();
        m.start();

//        Runnable r = new myTask2();
        Thread thread = new Thread(new myTask2(10));
        thread.start();

        for(int i=0; i<10; i++){
            System.out.println("sOut 2");
        }
    }
}
