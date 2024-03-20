package sem_final;

class printer{
    void print(int n, String name){
        for(int i=0; i<n; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            System.out.println("Document of "+name+" "+i);
        }
    }
}
class myThread extends Thread{
    printer pri;
    myThread(printer p){
        pri = p;
    }

    @Override
    public void run() {
        pri.print(10,"EEE.pdf");
    }
}
class yourThread extends Thread{
    printer pri;
    yourThread(printer p){
        pri = p;
    }

    @Override
    public void run() {
        pri.print(10,"DLD.pdf");
    }
}
public class mul_thread {
    public static void main(String[] args) {
        printer p = new printer();
//        p.print(10,"CSE.pdf");
        myThread m = new myThread(p);
        yourThread y = new yourThread(p);
        System.out.println(m.isAlive());
        m.start();
        System.out.println(m.isAlive());
        try {
            m.join();
        } catch (InterruptedException e) {
        }
        System.out.println(y.isAlive());
        y.start();
        System.out.println(y.isAlive());
    }
}
