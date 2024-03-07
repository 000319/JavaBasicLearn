package jihe3.map.case04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*需求﹔创理一个Hashmap集合，仔储二个键值对元素，每一个键值对元素的键是String，值是ArrayList
每一个Arraylist的元素是String，并遍历
思路：
1:创建HashMap集合
2:创建Arraylist集合,并添加元素
3:把ArrayList作为元素添加到HashMop集合
4:遍历HashMap集合
给出如下的数据:
第一个ArrayList集合的元素:(三国演义)诸葛亮  赵云
第二个ArrayList集合的元素,(西游记)唐僧     孙悟空
第三个ArrayList集合的元素:(水浒传)武松     鲁智深
*/
public class Demo {
    public static void main(String[] args) {
     //创建Hashmap集合
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        //创建ArrayList集合
        ArrayList<String> list1 = new ArrayList<>();
         list1.add("诸葛亮");
         list1.add("赵云");
        //添加到hashmap集合中
        hashMap.put("三国演义",list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("唐僧");
        list2.add("孙悟空");
        hashMap.put("西游记",list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("武松");
        list3.add("鲁智深");
        hashMap.put("水浒传",list3);

        //遍历输出
        Set<String> set = hashMap.keySet();
        for (String key:set){
            System.out.println(key);
            ArrayList<String> value = hashMap.get(key);
            for (String i:value){
                System.out.println("\t"+i);
            }
        }
    }
}
