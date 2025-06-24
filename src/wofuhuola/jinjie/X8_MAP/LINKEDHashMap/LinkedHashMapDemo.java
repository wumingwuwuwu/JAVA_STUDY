package wofuhuola.jinjie.X8_MAP.LINKEDHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();

        // 添加元素
        map.put("文章", "马伊俐");
        map.put("谢霆锋", "张柏芝");
        map.put("田亮", "叶一茜");
        map.put("汪峰", "章子怡");

        // 遍历
        Set<String> set = map.keySet();
        for (String key : set) {
            String value = map.get(key);
            System.out.println(key + "---" + value);
        }
        System.out.println("Linked都是插取顺序一致的");

    }
}

