package wofuhuola.jinjie.X8_MAP.TREEMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        //根据key排序
        //创建集合
        TreeMap<Student,String> tm = new TreeMap<Student,String>(
            new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    //主要条件 名字长度
                    int num = o2.getName().length() - o2.getName().length();
                    //次要条件 名字是是否相同不在乎正负
                    int num2 = num == 0 ?o1.getName().compareTo(o2.getName()):num;
                    //名字相同，比较年龄 正后比前大
                    int num3 = num2 == 0? o2.getAge()- o1.getAge():num2;
                    return num3;
                }
            }
        );


        // 创建对象
        Student s1 = new Student("linqingxia", 28);
        Student s2 = new Student("fengqingyang", 31);
        Student s3 = new Student("wangchongyang", 200);
        Student s4 = new Student("linqingxia", 28);
        Student s5 = new Student("fengqingyang", 20);
        Student s6 = new Student("wangyang", 100);

        // 添加元素
        tm.put(s1, "it001");
        tm.put(s2, "it002");
        tm.put(s3, "it003");
        tm.put(s4, "it004");
        tm.put(s5, "it005");
        tm.put(s6, "it006");

        // 遍历
        Set<Student> set = tm.keySet();
        for (Student key : set) {
            String value = tm.get(key);
            System.out.println(key.getName() + "---" + key.getAge() + "---"
                    + value);
        }
    }
}
