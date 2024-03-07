package thread4;
//1、继承Thread类
public class MyThreadDemo01SeZhiXianChengMingCheng extends Thread{
    //2、创建含参构造方法实现名称赋值
    public MyThreadDemo01SeZhiXianChengMingCheng(String name)
    {
        this.setName(name);
    }

    public static void main(String[] args){
  //3、创建线程
        MyThreadDemo01SeZhiXianChengMingCheng thread0 = new MyThreadDemo01SeZhiXianChengMingCheng("线程0");
        MyThreadDemo01SeZhiXianChengMingCheng thread1 = new MyThreadDemo01SeZhiXianChengMingCheng("线程1");
        MyThreadDemo01SeZhiXianChengMingCheng thread2 = new MyThreadDemo01SeZhiXianChengMingCheng("线程2");
        MyThreadDemo01SeZhiXianChengMingCheng thread3 = new MyThreadDemo01SeZhiXianChengMingCheng("线程3");
        //4、启动线程
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
         System.out.println("线程分配完毕");

    }

    //5、使用run方法
    public void run(){

        System.out.println(Thread.currentThread().getName()+"开启");
        long startTime= System.currentTimeMillis();
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"当前值为："+i);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("耗时为："+(endTime-startTime));
    }

   }

