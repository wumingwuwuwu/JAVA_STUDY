package AAAAA.bjsxt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("b");
        list.add("d");
        list.add("a");
        //通过Collections工具类中的sort方法完成排序
        Collections.sort(list);
        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("-------------------------");
        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        //洗牌处理
        Collections.shuffle(list2);
        for (String str : list2) {
            System.out.println(str);
        }
    }

}