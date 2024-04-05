package lk.Ijse;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable one= () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("one");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable two = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("two");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1=new Thread(one);
        Thread t2=new Thread(two);

        t1.start();
       // t1.setName("thread One");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread Name :" +t1.getName());    /*isAlive  method eken balanne e thread eka un wenwd kiyana eka*/
        t2.start();
       // t2.setName("Thread Two");
        System.out.println("thread one Status :" +t2.getName());

        t1.join();  /*join methos use krt passe threads okkom run wela iwr unat PSSSE sout eka pront wenw  join keyword eka nathiwa kroth bye kiyala print wenw t1 start with first*/
        t2.join();

        System.out.println("bye");
    }

}


/* thread ekt name ekk dunnoth setName(); method eken ee nama console eke print krganna plwn ..name ekak dunnthnm console eke number ekk thmi print wenne Thread eke active status ekt */