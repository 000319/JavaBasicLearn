package thread4.threadcase;

public class Producer implements Runnable{
    public Box b;
    public Producer(Box b) {
      this.b=b;
    }

    @Override
    public void run() {
     for(int i=1;i<=10;i++){
          b.put(i);
     }
    }
}
