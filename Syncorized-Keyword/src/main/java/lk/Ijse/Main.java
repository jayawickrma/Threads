package lk.Ijse;

class caculation{
    int num;
    public synchronized void increment(){   /* synchonrized keyword eken wenne real total eka ganna eka */
        num ++;

    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        caculation calc =new caculation();

       Thread t1 =new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i=1 ;i<=1000 ;i++){
                 calc.increment();
               }
           }
       });

        Thread t2 =new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1 ;i<=10000 ;i++){
                    calc.increment();
                }
            }
        });
       t1.start();
       t2.start();
       t1.join();
       t2.join();
        System.out.println("COUNT :" +calc.num);
    }
}