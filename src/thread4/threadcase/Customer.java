package thread4.threadcase;

public class Customer implements Runnable{
    public Box b;
    public Customer(Box b) {
        this.b= b;
    }
    @Override
    public void run() {
     while (true){
         b.get();
     }
    }
}
