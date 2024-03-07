package thread4;

public class ThreadDaemonDemo01 implements Runnable{
    public static void main(String[] args) {
          //ThreadDaemon-------守护线程（当主线程死亡时被设置成守护线程的线程也将不再运行；注意：不再执行不代表立即停止而是代表很快停止)
        ThreadDaemonDemo01 daemonDemo = new ThreadDaemonDemo01();
        Thread daemonDemo01 = new Thread(daemonDemo,"张飞");
        Thread daemonDemo02 = new Thread(daemonDemo,"关羽");
        Thread daemonDemo03 = new Thread(daemonDemo,"刘备");

        //设置守护守护线程
        daemonDemo01.setDaemon(true);
        daemonDemo02.setDaemon(true);
        //Thread.currentThread().setName("刘备");


        //线程开启
        daemonDemo01.start();
        daemonDemo02.start();
        daemonDemo03.start();
    }

    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"当前值为："+i);
        }
    }
}
