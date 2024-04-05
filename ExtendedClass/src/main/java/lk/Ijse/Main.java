package lk.Ijse;


class one extends Thread{
    public void winchThread(){
        for (int i =1 ;i<=5 ;i++){
            System.out.println("one");
        }
    }
}

class two extends Thread{
    public void winchThread(){
        for (int i =1 ;i<=5 ;i++){
            System.out.println("two");
        }
    }
}
public class Main {

    public static void main(String[] args) {
        one onji =new one();
        two obj2 =new two();

        onji.winchThread();
        obj2.winchThread();

    }
}