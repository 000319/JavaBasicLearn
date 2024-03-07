package thread4.threadcase;

public class ThreadCaseDemo {
    public static void main(String[] args) {
        Box b = new Box();
        Producer p = new Producer(b);
        Customer c = new Customer(b);

         //创建线程执行Customer、Producer中的run方法
        Thread thread1 = new Thread(p);
        Thread thread2 = new Thread(c);

        thread1.start();
        thread2.start();
    }
}
