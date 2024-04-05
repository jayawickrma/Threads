package lk.Ijse;


class one extends Thread{
    public void run(){
        for (int i =1 ;i<=5 ;i++){
            System.out.println("one");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class two extends Thread{
    public void run(){
        for (int i =1 ;i<=5 ;i++){
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
        one onji =new one();
        two obj2 =new two();

       onji.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();
    }
}