package thread4;

//1、继承Thread类
public class MyThreadDemo01 extends Thread {


    public static void main(String[] args) {

        //2、创建线程
        MyThreadDemo01 thread0 = new MyThreadDemo01();
        MyThreadDemo01 thread1 = new MyThreadDemo01();
        MyThreadDemo01 thread2 = new MyThreadDemo01();
        MyThreadDemo01 thread3 = new MyThreadDemo01();

        thread0.setName("线程0");
        thread1.setName("线程1");
        thread2.setName("线程2");
        thread3.setName("线程3");
        //3、启动线程
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("线程分配完毕");
    }

    //4、使用run方法
    public void run() {
        System.out.println("线程" + Thread.currentThread().getName() + "开启");
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "当前值为：" + i);
        }
    }
}
