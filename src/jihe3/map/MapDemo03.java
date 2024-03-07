package jihe3.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/*Nap集合的获取功能:
v get( object key) :根据键获取值
Set<K> keySet():获取所有键的集合
collection<v> values():获取所有值的集合
*/
public class MapDemo03 {
    public static void main(String[] args) {
        HashMap<String,String> map =new HashMap<>();
        //添加元素
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("小龙女","杨过");
        //获取元素-----不等于遍历
        //1、v get( 0bject key) :根据键获取值
        System.out.println(map.get("郭靖"));
        System.out.println("----------");

        //2、Set<K> keySet():获取所有键的集合
        Set<String> set = map.keySet();
        for (String i:set){
            System.out.println(i);
        }
        System.out.println("----------");

        //3、colLection<v> vaLues():获职所有值的集合
        Collection<String> values = map.values();
        for(String value : values) {
            System.out.println(value);
        }
    }
}
