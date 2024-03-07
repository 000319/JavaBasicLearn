package jihe3.map.case03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*思路:
1:创建Arraylist集合
2:创定HashiMap集合,并添加健值对元素
3:把Hashap作为元素添加到Arraylist集合
4:遍历Arraylist集合
给出如下的数据:
第一个Hashap集合的元素:
孙策   大乔
周瑜   小养
第二个HashMap集合的元素:
郭靖   黄蓉
杨过   小龙女
第三个HashMap集合的元素:
令孤冲  任盈盈
林平之  岳灵珊
*/
public class Demo {
    public static void main(String[] args) {
       //创建Arraylist集合
        ArrayList<HashMap<String,String>> list = new ArrayList<>();
        //创定HashMap集合,并添加健值对元素
        HashMap<String,String> map1 = new HashMap<>();
        map1.put("孙策","大乔");
        map1.put("周瑜","小养");
        //把Hashmap作为元素添加到Arraylist集合
        list.add(map1);
        HashMap<String,String> map2 = new HashMap<>();
        map2.put("郭靖","黄蓉");
        map2.put("杨过","小龙女");
        list.add(map2);
        HashMap<String,String> map3 = new HashMap<>();
        map3.put("令孤冲","任盈盈");
        map3.put("林平之","岳灵珊");
        list.add(map3);
        //遍历Arraylist集合
        for (HashMap<String,String> i:list){
            Set<String> set = i.keySet();
            for (String key:set){
                String outcome = i.get(key);
                System.out.println(outcome);
            }

        }
    }
}
