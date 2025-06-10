package wofuhuola.jinjie.MAP.HASHMap;

import javax.xml.namespace.QName;
import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
        String[] arr = {"a","b","c","d"};
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }
        HashMap<String,Integer> hashMap = new HashMap<>();

        for (String s : list) {
            //判断当前景点在map中是否存在
            if(hashMap.containsKey(s)){
                //存在
                //获取当前景点票数,票数加1，再将新次数添加到集合中
                int count = hashMap.get(s);
                count++;
                hashMap.put(s,count);
            }else{
                hashMap.put(s,1);
            }
        }
        //求最大
        int Max = 0;
        Set<Map.Entry<String,Integer>> entries = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count > Max){
                Max = count;
            }
        }
        for (Map.Entry<String, Integer> entry : entries) {
            int count = entry.getValue();
            if (count == Max){
                System.out.println(entry.getKey());
            }
        }
        System.out.println(Max);
    }
}
