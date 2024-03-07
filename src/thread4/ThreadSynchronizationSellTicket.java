package thread4;
//方法一：同步锁实现
//方法二：同步方法实现
//线程同步案例--售票
public class ThreadSynchronizationSellTicket implements Runnable {
    private final Object obj = new Object();
    public int ticket = 20;

    public static void main(String[] args) {
        //创建线程
        ThreadSynchronizationSellTicket runnable = new ThreadSynchronizationSellTicket();
        Thread thread1 = new Thread(runnable, "窗口1");
        Thread thread2 = new Thread(runnable, "窗口2");
        Thread thread3 = new Thread(runnable, "窗口3");
        //启动线程
        thread1.start();
        thread2.start();
        thread3.start();
    }

    public void run() {
        while (true) {
            //方法一
           /* try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在售出" + "第" + ticket + "张票");
                    ticket--;
                }
            }*/
            //方法二
            sellTicket();
        }
    }

    private void sellTicket() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (obj) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "正在售出" + "第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
