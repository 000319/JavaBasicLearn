package thread4;

public class ThreadPriorityDemo01 extends Thread{
    public ThreadPriorityDemo01(String name){
        this.setName(name);
    }
    public static void main(String[] args) {

        ThreadPriorityDemo01 thread1 = new ThreadPriorityDemo01("飞机");
        ThreadPriorityDemo01 thread2 = new ThreadPriorityDemo01("汽车");
        ThreadPriorityDemo01 thread3 = new ThreadPriorityDemo01("自行车");

       /* //获取当前线程优先级
        System.out.println(thread1.getPriority());//5
        System.out.println(thread2.getPriority());//5
        // 获取线程优先级范围
        System.out.println(Thread.MAX_PRIORITY);//10
        System.out.println(Thread.MIN_PRIORITY);//1
*/
        //设置线程优先级
        thread1.setPriority(10);
        thread2.setPriority(5);
        thread3.setPriority(1);

        thread1.start();
        thread2.start();
        thread3.start();
    }
    public void run(){
        System.out.println("线程"+Thread.currentThread().getName()+"开启");
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"当前值为："+i);
        }
    }
}
