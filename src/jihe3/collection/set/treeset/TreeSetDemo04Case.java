package jihe3.collection.set.treeset;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo04Case {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        Random random = new Random();
        while (set.size()<10){
            int num = random.nextInt(20)+1;
            set.add(num);
        }
        for (Integer i:set){
            System.out.println(i);
        }
    }
}
