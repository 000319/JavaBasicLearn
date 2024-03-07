package thread4;

public class ThreadSleepDemo01 extends Thread{
    public ThreadSleepDemo01(String name){
        this.setName(name);
    }
    public static void main(String[] args) {
        ThreadSleepDemo01 sleepDemo01 = new ThreadSleepDemo01("王文俊1");
        ThreadSleepDemo01 sleepDemo02 = new ThreadSleepDemo01("李仁辉2");
        ThreadSleepDemo01 sleepDemo03 = new ThreadSleepDemo01("郑文静3");

        sleepDemo01.start();
        sleepDemo02.start();
        sleepDemo03.start();
    }

    @Override
    public void run() {
        System.out.println("线程"+Thread.currentThread().getName()+"开启");
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"当前值为："+i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
