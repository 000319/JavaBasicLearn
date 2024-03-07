package jihe3.map;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*案例:统计字符串中每个字符出现的次数
需求:键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
举例:键盘录入“aababcabcdabcde"
在控制台输出:“a(5)b(4)c(3)d(2)e(1)"
思路:
1、键盘录入一个字符串
2、创建HashMap集合，键是Character，值是Integer遍历字符串，得到每一个字符
3、拿得到的每一个字符作为键到HashMap集合中去揪对应的值，看其返回值
4、如果返回值是null:说明该字符在HashMap集合中不存在，就把该字符作为键，1作为值存储
如果返回值不是null:说明该字符在HashMap集合中存在，把该值加1，然后重新存储该字符和对应的值
*/
public class case05 {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("please input chars to control Platform by keyword:");
            String sc = input.next();
            //创建HashMap集合
            //HashMap<Character,Integer> hashMap = new HashMap<>();
            //或
            TreeMap<Character, Integer> hashMap = new TreeMap<>();

            //遍历每一个字符串得到每一个字符
            for (int i = 0; i < sc.length(); i++) {
                char key = sc.charAt(i);
                //拿得到的每一个字符作为键到HashMap集合中去揪对应的值，看其返回值
                Integer value = hashMap.get(key);
                //如果返回值是null:说明该字符在HashMap集合中不存在，就把该字符作为键，1作为值存储
                if (value == null) {
                    hashMap.put(key, 1);
                }
                //如果返回值不是null:说明该字符在HashMap集合中存在，把该值加1，然后重新存储该字符和对应的值
                if (value != null) {
                    value++;
                    hashMap.put(key, value);
                }
            }
            //遍历HashMop集合，得到键和值,按照要求进行拼接
            StringBuilder sb = new StringBuilder();
            Set<Character> keySet = hashMap.keySet();
            for (Character key : keySet) {
                Integer value = hashMap.get(key);
                sb.append(key).append("(").append(value).append(")");
            }
            String result = sb.toString();
            //输出结果
            System.out.println(result);
        }

    }
}
