package thread4;

public class ThreadJoinDemo01 extends Thread{
    public ThreadJoinDemo01(String name){
        this.setName(name);
    }
    public static void main(String[] args) {
        ThreadJoinDemo01 joinDemo01 = new ThreadJoinDemo01("康熙");
        ThreadJoinDemo01 joinDemo02 = new ThreadJoinDemo01("四阿哥");
        ThreadJoinDemo01 joinDemo03 = new ThreadJoinDemo01("八阿哥");

        joinDemo01.start();
        try {
            joinDemo01.join();//但被执行join操作的线程死亡（运行完成后）其他线程才会开始执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        joinDemo02.start();
        joinDemo03.start();
    }
    public  void  run(){
        System.out.println(Thread.currentThread().getName()+"开始争皇位");
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"当前值为："+i);
        }
    }
}
