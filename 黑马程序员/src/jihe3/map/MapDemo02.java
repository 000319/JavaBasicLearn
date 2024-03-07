package jihe3.map;

import java.util.HashMap;

/*Map集合的基本功能:
1、V put(K key ,v vaLue):添加元素
2、V remove(object key):根据键册除健值对元素
3、void clear():移除所有的键值对元素
4、boolean containsKey(object key):判断集合是否包含指定的键
5、boolean containsValue(object value):判断集合是否包含指定的值
6、boolean isEmpty ():判断集合是否为空
7、int size():集合的长度,也就是集合中键值对的个数
*/
public class MapDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<String,String> map = new HashMap<>();
        //1、V put(K key ,v vaLue):添加元素
        map.put("彰化","18");
        map.put("刘化","15");
        map.put("含化","19");

       /* //2、V remove(object key):根据键册除健值对元素
        map.remove("含化");*/

       /* //3、void clear():移除所有的键值对元素
        map.clear();*/

        /*//4、boolean containsKey(0bject key):判断集合是否包含指定的键
        System.out.println(map.containsKey("刘化"));*/

      /*  //5、boolean containsValue(0bject value):判断集合是否包含指定的值
        System.out.println(map.containsValue("19"));*/

        /*//6、boolean isEmpty ():判断集合是否为空
        System.out.println(map.isEmpty());*/

        //7、int size():集合的长度,也就是集合中键值对的个数
        System.out.println(map.size());
    }
}
