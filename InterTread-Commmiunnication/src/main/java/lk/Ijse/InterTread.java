package lk.Ijse;

class Q{
    int num;

    public int getNum() {
        System.out.println("Get :"+num);
        return num;
    }

    public void setNum(int num) {
        System.out.println("Put :"+num);
        this.num = num;

    }
}
class producer implements Runnable{
    Q q;
    public producer(Q q) {
        this.q=q;
        Thread t=new Thread(this,"producer");
        t.start();
    }
    public void run() {
        int i=0;
        while (true){
            q.setNum(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class consumer implements Runnable{
    Q q;
    public consumer(Q q) {
        this.q=q;
        Thread t=new Thread(this,"producer");
        t.start();
    }
    public void run() {
        int i=0;
        while (true){
            q.getNum();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class InterTread {
    public static void main(String[] args) {
        Q q =new Q();
        new producer(q);
        new consumer(q);

    }
}
