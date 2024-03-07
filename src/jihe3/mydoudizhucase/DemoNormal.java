package jihe3.mydoudizhucase;

import java.util.ArrayList;
import java.util.Collections;

/*需求:通过程序实现斗地主过程中的洗牌，发牌和看牌
思路:
1:创建一个牌盒,也就是定义一个集合对象，用ArrayList集合实现
2:往牌盒里面装牌
3:洗牌，也就是把牌打撒。用collections的shuffle()方法实现
4:发牌，也就是遍历集合,给三个玩家发牌
5:看牌，也就是三个玩家分别遍历自己的牌
*/
public class DemoNormal {
    public static void main(String[] args) {

        //1、创建一个牌盒
        ArrayList<String> array = new ArrayList<>();
        //定义点数、花色数组
        String[] number ={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] color = {"♥","♦","♣","♠"};
        //2、往牌盒里面装牌
        for (String colors:color)
            for (String numbers:number){
                array.add(colors+numbers);
            }
        array.add("大王");
        array.add("小王");
        //3、洗牌
        Collections.shuffle(array);
       //4、发牌，也就是遍历集合,给三个玩家发牌
        ArrayList<String> array1 = new ArrayList<>();
        ArrayList<String> array2 = new ArrayList<>();
        ArrayList<String> array3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i=0;i<array.size();i++){
            String pai = array.get(i);
            if(i>=array.size()-3){
                dipai.add(pai);
            }
            else if(i%3==0){
                array1.add(pai);
            }
            else if (i%3==1){
                array2.add(pai);
            }
            else if (i%3==2){
                array3.add(pai);
            }
        }
        Collections.sort(array1);
        System.out.println(array1);
        System.out.println("------------");
        Collections.sort(array2);
        Collections.sort(array3);
        Collections.sort(dipai);
        looker("张三丰",array1);
        looker("张无忌",array2);
        looker("周芷若",array3);
        looker("底牌",dipai);
    }
    //5、看牌，也就是三个玩家分别遍历自己的牌
    public static void looker(String name,ArrayList<String> array){
        System.out.print(name+"的牌为：");
        for (String a:array){
            System.out.print(a+"  ");
        }
        System.out.println( );
    }
}
