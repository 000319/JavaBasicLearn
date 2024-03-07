package thread4.threadcase;

public class Box {
    private int milk;
    public boolean state =false;
   public synchronized void put(int milk){
       if(state){
           try {
               wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       this.milk=milk;
       System.out.println("送奶工将"+"第"+this.milk+"瓶奶送入奶箱");

       state=true;
       notifyAll();
    }
    public synchronized void get(){
       if(!state){
           try {
               wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
        System.out.println("客户拿到"+"第"+this.milk+"瓶奶");

       state=false;
       notifyAll();
    }
}
