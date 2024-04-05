package lk.Ijse;

class myRunneble implements Runnable{
    public void run() {
        for (int i=1 ;i<=5 ;i++){
            System.out.println("one");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class myRunneble2 implements Runnable{
    public void run() {
        for (int i=1 ;i<=5 ;i++){
            System.out.println("two");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        myRunneble myRunneble=new myRunneble();
        myRunneble2 myRunneble2=new myRunneble2();
      Thread t1=new Thread(myRunneble);
      Thread t2=new Thread(myRunneble2);
      t1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
    }
}