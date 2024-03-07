package thread4;
//1、让类实现接口Runnable
public class MyRunnableDemo01 implements Runnable{
    public static void main(String[] args) {
        //2、创建RunnableDemo01的目标对象
        MyRunnableDemo01  runnable = new MyRunnableDemo01();
       //3、创建Thread类的对象并将RunnableDemo01类的目标对象（参数）传给Thread类的对象
        Thread thread1 = new Thread(runnable,"线程1");  //  Thread thread1 = new Thread(target)/new Thread(target,name);
        Thread thread2 = new Thread(runnable,"线程2");
        //4、开启线程
         thread1.start();
         thread2.start();
        System.out.println(Thread.currentThread().getName()+"线程开启");
    }

        //实现Run方法
    @Override
    public void run() {
        System.out.println("线程"+Thread.currentThread().getName()+"开启");
        for(int i=0;i<=10;i++) {
            System.out.println(Thread.currentThread().getName() + "当前值为：" + i);
        }
    }
}
