package jihe3.map;

import java.util.HashMap;
import java.util.Set;

/*Map集合的遍历(方式1 ):
1:获取所有键的集合。用keySet()方法实现
2:谊历链的集合,获取到每—个键。用增强for实现
3:根据链去找值。用get( object key)方法实现
*/
public class MapDemo04 {
    public static void main(String[] args) {
        HashMap<String,String> map =new HashMap<>();
        //添加元素
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("小龙女","杨过");
        //获取所有键的集合。用keySet()方法实现
        Set<String> keySet = map.keySet( );
        //遍历健的集合,获取到每—个键。用增强for实现
        for (String key : keySet) {
        //根据键去找值。用get (object key)方法实现
        String value = map.get(key ) ;
            System.out.println(key+","+value);
    }

}
}
