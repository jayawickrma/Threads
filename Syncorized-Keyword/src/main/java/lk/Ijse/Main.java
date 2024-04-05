package lk.Ijse;

class caculation{
    int num;
    public void increment(){
        num ++;
        System.out.println("count :"+num);
    }
}

public class Main {
    public static void main(String[] args) {
        caculation calc =new caculation();
        calc.increment();
        calc.increment();
    }
}