package jihe3.mydoudizhucase;

import java.util.*;

/*需求:
通过程序实现斗地主过程中的洗牌、发牌和看牌。
要求:对牌进行排序思路。
1:创建HashMap键是编号值是牌
2:创建Arraylist，存储编号
3:创建花色数组和点数数组
4:从开始往HashMop里面存储编号，并存储对应的牌。同时往ArrayList里面存储编号
5:洗牌洗的是编号，用collections的shuffle(）方法实现
6:发牌(发的也是编号，为了保证编号是排序的。创建TreeSet集合接收
7:定义方法看牌遍历TreeSet集合，获取编号，到HashMap集合找对应的牌
8:调用看牌方法
*/
public class DemoPromotion {
    public static void main(String[] args) {
        //1:创建HashMap键是编号值是牌
        HashMap<Integer, String> map = new HashMap<>();
        //2:创建Arraylist，存储编号
        ArrayList<Integer> arrayList = new ArrayList<>();
        //3:创建花色数组和点数数组
        String[] color = {"♥", "♦", "♣", "♠"};
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        //4:从0开始往HashMop里面存储编号，并存储对应的牌。同时往ArrayList里面存储编号
        int index = 0;
        for (String numbers : number) {
            for (String  colors: color) {
                map.put(index, colors + numbers);
                arrayList.add(index);
                index++;
              }
            }
            map.put(index, "大王");
            arrayList.add(index);
            index++;
            map.put(index, "小王");
            arrayList.add(index);
        //5:洗牌洗的是编号，用collections的shuffle(）方法实现
        Collections.shuffle(arrayList);
        //6:发牌(发的也是编号，为了保证编号是排序的。创建TreeSet集合接收
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        TreeSet<Integer> treeSet2 = new TreeSet<>();
        TreeSet<Integer> treeSet3 = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (i >= arrayList.size() - 3) {
                dipai.add(arrayList.get(i));
            } else if (i % 3 == 0) {
                treeSet1.add(arrayList.get(i));
            } else if (i % 3 == 1) {
                treeSet2.add(arrayList.get(i));
            } else if (i % 3 == 2) {
                treeSet3.add(arrayList.get(i));
            }
        }
        //7:定义方法看牌遍历TreeSet集合，获取编号，到HashMap集合找对应的牌
        looker("张三丰", treeSet1, map);
        looker("张无忌", treeSet2, map);
        looker("令狐冲", treeSet3, map);
        looker("底牌", dipai, map);

    }

    public static void looker(String name, TreeSet<Integer> set, HashMap<Integer, String> map) {
        System.out.print(name + "的牌为：");
        for (Integer outcome : set) {
            String num = map.get(outcome);
            System.out.print(num + "  ");
        }
        System.out.println();
    }
}
