package jihe3.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*Map集合的遍历(方式2):
1:获取所有键值对对象的集合:set<Map .Entry<K,v>> entrySet();
2:遍历健值对对象的集合，得到每—个键值对对象用增强for实现,得到每—个Map.Entry
3:根据链值对对象获取键和值
用getKey()得到键
用getvalue()得到值
*/
public class MapDemo05 {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<String,String> map =new HashMap<>();
        //添加元素
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("小龙女","杨过");
        //获取所有键值对对象的集合
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        //遍历健值对对象的集合
        for (Map.Entry<String,String> outcome:entrySet){
            String key = outcome.getKey();
            String value = outcome.getValue();
            System.out.println(key+","+value);
        }
    }
}
